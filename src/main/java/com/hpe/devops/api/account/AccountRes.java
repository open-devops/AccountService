package com.hpe.devops.api.account;

import org.springframework.data.annotation.Id;

public class AccountRes {

    private String id;

    private String organizationId;
    
    private String name;
    
    private String mail;
    
    private String accessToken;

    private String roleId;
    
    private String roleName;
    
    public static AccountRes getAccountRes(Account account){
    	AccountRes accountRes = new AccountRes();
    	
    	accountRes.setId(account.getId());
    	accountRes.setOrganizationId(account.getOrganizationId());
    	accountRes.setName(account.getName());
    	accountRes.setMail(account.getMail());
    	accountRes.setAccessToken(account.getAccessToken());
    	accountRes.setRoleId(account.getRoleId());
    	
    	return accountRes;

    }
    
    public AccountRes(){
    	
    }


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
