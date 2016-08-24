package com.hpe.devops.api.account;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
	
	List<Account> findByOrganizationId(String organizationId);
}
