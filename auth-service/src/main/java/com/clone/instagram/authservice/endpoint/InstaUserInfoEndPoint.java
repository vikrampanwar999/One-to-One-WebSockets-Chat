package com.clone.instagram.authservice.endpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.instagram.authservice.exception.ResourceNotFoundException;
import com.clone.instagram.authservice.fetchdata.FetchInstaaUserDetails;
import com.clone.instagram.authservice.model.InstaUserDetails;
import com.clone.instagram.authservice.model.InstaUserInfo;
import com.clone.instagram.authservice.model.InstaUserInfoRequest;
import com.clone.instagram.authservice.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/insta")
public class InstaUserInfoEndPoint {
	@Autowired private FetchInstaaUserDetails fetchInstaaUserDetails;
	@Autowired private UserService userService;
	private Map<String,List<InstaUserInfo>> fbUserNameToInstaNames=new HashMap<>();
	
    @PostMapping(value = "/register/user", produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getUserSummary(@RequestBody InstaUserInfoRequest userInfoRequest,@AuthenticationPrincipal InstaUserDetails userDetails) {
      
    	log.info("retrieving user {}", userInfoRequest);
        log.info("retrieving fbuser {}", userDetails);
        InstaUserInfo instaUser=fetchInstaaUserDetails.getUserDetailsFromUserId(userInfoRequest);
        instaUser.setFbUserName(userDetails.getUsername());
        //don't savve if it's already there
        userService.saveInstaAccount(instaUser);
        List<InstaUserInfo> assoicatedArrayList=fbUserNameToInstaNames.getOrDefault(userDetails.getUsername(), new ArrayList<>());
        assoicatedArrayList.add(instaUser);
        fbUserNameToInstaNames.put(userDetails.getUsername(), assoicatedArrayList);
        return  ResponseEntity.ok(instaUser);
    }
    @GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getUserSummary(@AuthenticationPrincipal InstaUserDetails userDetails) {   
    	//check if username doesn't change with time
        log.info("retrieving fbuser {}", userDetails);
        List<InstaUserInfo> accounts=userService.getInstaAccountsByFbUserName(userDetails.getUsername());
        return  ResponseEntity.ok(accounts);
    }
    
    
    


}
