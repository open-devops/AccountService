package com.hpe.devops.api.account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.devops.api.account.otherapi.roleservice.Role;
import com.hpe.devops.api.account.otherapi.roleservice.RoleService;

@RestController
@RequestMapping(value = "/accounts", produces = { "application/json" })
public class AccountController {

	
	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<AccountRes> getAllAccounts() throws Exception {
		
		List<Account> accountList = accountRepo.findAll();
		
		List<AccountRes> accountListRes = new ArrayList<AccountRes>();
		
		for(Account account: accountList){
			Role role = roleService.getRole(account.getRoleId());
			
			AccountRes accountRes = AccountRes.getAccountRes(account);
			
			accountRes.setRoleName(role.getName());
			
			accountListRes.add(accountRes);
			
		}
		
		return accountListRes;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public AccountRes getAccountById(@PathVariable String id) throws Exception {
		
		AccountRes accountRes = AccountRes.getAccountRes(accountRepo.findOne(id));
		
		accountRes.setRoleName(roleService.getRole(accountRes.getRoleId()).getName());
		
		return accountRes;
	}
	
	@RequestMapping(value = "/organization/{organizationId}", method = RequestMethod.GET)
	public List<AccountRes> getAllAccountsByOrgId(@PathVariable String organizationId) throws Exception {
		
		List<Account> accountList = accountRepo.findByOrganizationId(organizationId);
		
		List<AccountRes> accountListRes = new ArrayList<AccountRes>();
		
		for(Account account: accountList){
			Role role = roleService.getRole(account.getRoleId());
			
			AccountRes accountRes = AccountRes.getAccountRes(account);
			
			accountRes.setRoleName(role.getName());
			
			accountListRes.add(accountRes);
			
		}
		
		return accountListRes;
	}
	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<AccountRes> addAccount(@RequestBody Account account) throws Exception {
	
		account.setId(UUID.randomUUID().toString());
		
		account = accountRepo.save(account);
		
		AccountRes accountRes = AccountRes.getAccountRes(account);
		
		accountRes.setRoleName(roleService.getRole(accountRes.getRoleId()).getName());
		
		return new ResponseEntity<AccountRes>(accountRes, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<AccountRes> updateAccount(@RequestBody Account account) throws Exception {
		
		account = accountRepo.save(account);
		
		AccountRes accountRes = AccountRes.getAccountRes(account);
		
		accountRes.setRoleName(roleService.getRole(accountRes.getRoleId()).getName());
		
		return new ResponseEntity<AccountRes>(accountRes, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<AccountRes> deleteAccount(@PathVariable String id) throws Exception {

		AccountRes res = this.getAccountById(id);
		
		accountRepo.delete(id);
		
		return new ResponseEntity<AccountRes>(res, HttpStatus.OK);
	}
}
