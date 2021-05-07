package com.clone.instagram.authservice.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.clone.instagram.authservice.model.InstaUserInfo;
import com.clone.instagram.authservice.model.User;

public interface InstaAccountRepository extends MongoRepository<InstaUserInfo, String> {
	
	List<InstaUserInfo> findByFbUserName(String username);

}
