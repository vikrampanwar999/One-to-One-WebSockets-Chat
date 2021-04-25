package com.clone.instagram.authservice.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.instagram.authservice.exception.ResourceNotFoundException;
import com.clone.instagram.authservice.fetchdata.FetchInstaaUserDetails;
import com.clone.instagram.authservice.model.InstaUserInfoRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/insta")
public class InstaUserInfoEndPoint {
	@Autowired private FetchInstaaUserDetails fetchInstaaUserDetails;
    @PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getUserSummary(@RequestBody InstaUserInfoRequest userInfoRequest) {
        log.info("retrieving user {}", userInfoRequest);
        
        return  ResponseEntity.ok(fetchInstaaUserDetails.fetchfollowerCount(userInfoRequest.getUser_id()));
    }


}
