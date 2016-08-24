package com.hpe.devops.api.account;

import org.springframework.data.annotation.Id;

public class Account {

    private String id;

    private Long organizationId;
    
    private String name;
    
    private String description;

    private String roleId;
    
    public Account(){
    	
    }

	public Account(Long organizationId, String name, String description, String roleId) {
		super();
		this.organizationId = organizationId;
		this.name = name;
		this.description = description;
		this.roleId = roleId;
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
}
