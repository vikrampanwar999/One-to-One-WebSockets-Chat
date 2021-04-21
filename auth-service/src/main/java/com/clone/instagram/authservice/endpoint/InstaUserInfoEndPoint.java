package com.clone.instagram.authservice.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.instagram.authservice.exception.ResourceNotFoundException;
import com.clone.instagram.authservice.fetchdata.FetchInstaaUserDetails;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/insta")
public class InstaUserInfoEndPoint {
	@Autowired private FetchInstaaUserDetails fetchInstaaUserDetails;
    @GetMapping(value = "/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUserSummary(@PathVariable("username") String username) {
        log.info("retrieving user {}", username);
        
        return  ResponseEntity.ok(fetchInstaaUserDetails.fetchfollowerCount(username));
    }


}
