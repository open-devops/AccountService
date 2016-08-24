package com.hpe.devops.api.account;

import org.springframework.data.annotation.Id;

public class Account {

    private String id;

    private String organizationId;
    
    private String name;
    
    private String mail;
    
    private String accessToken;

    private String roleId;
    
    public Account(){
    	
    }

    
    
	public Account(String organizationId, String name, String mail, String accessToken, String roleId) {
		super();
		this.organizationId = organizationId;
		this.name = name;
		this.mail = mail;
		this.accessToken = accessToken;
		this.roleId = roleId;
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
}
