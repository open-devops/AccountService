package com.hpe.devops.api.account.otherapi.roleservice;

import org.springframework.data.annotation.Id;

public class Role {

    @Id
    private Long id = -1l;

    private String organizationId;
    
    private String name;
    
    private String description;

    public Role(){
    	
    }
    
	public Role(String organizationId, String name, String description) {
		super();
		this.organizationId = organizationId;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

        
}
