package com.hpe.devops.api.account;

import org.springframework.data.annotation.Id;

public class AccountRes {

    @Id
    private String id;

    private Long organizationId;
    
    private String name;
    
    private String description;

    private String roleId;
    
    private String roleName;
    
    public static AccountRes getAccountRes(Account account){
    	AccountRes accountRes = new AccountRes();
    	
    	accountRes.setId(account.getId());
    	accountRes.setOrganizationId(account.getOrganizationId());
    	accountRes.setName(account.getName());
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

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
