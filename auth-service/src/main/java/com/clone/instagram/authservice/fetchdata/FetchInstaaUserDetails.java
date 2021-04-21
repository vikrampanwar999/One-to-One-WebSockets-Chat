package com.clone.instagram.authservice.fetchdata;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.clone.instagram.authservice.fetchdata.model.Example;
import com.clone.instagram.authservice.fetchdata.model.Graphql;
import com.clone.instagram.authservice.model.InstaUserInfo;

@Component
public class FetchInstaaUserDetails {
	@Autowired private RestTemplate restTemplate;
	private String instaUserDetailApi="https://www.instagram.com/{username}/?__a=1";
	private static Map<String,InstaUserInfo> userInfoMap=new HashMap<>();
	public FetchInstaaUserDetails() {
		// TODO Auto-generated constructor stub
	}
	public InstaUserInfo fetchfollowerCount(String username) {
		
		String url=instaUserDetailApi.replace("{username}", username);
		ResponseEntity<Example> example=restTemplate.getForEntity(url, Example.class);
		InstaUserInfo userInfo=new InstaUserInfo();
		if(example.hasBody()) {
			Example instaUserDetails=example.getBody();
			Graphql g=instaUserDetails.getGraphql();
			userInfo.setFollowings(g.getUser().getEdgeFollow().getCount());
			userInfo.setFollowers(g.getUser().getEdgeFollowedBy().getCount());
			userInfo.setMutualFollowers(g.getUser().getEdgeMutualFollowedBy().getCount());
			userInfo.setFbId(g.getUser().getFbid());
			userInfo.setInstaId(g.getUser().getId());
			userInfo.setIsVerified(g.getUser().getIsVerified());
			userInfo.setInstaUserName(g.getUser().getUsername());
			userInfo.setInstaProfilePicUrl(g.getUser().getProfilePicUrl());
			userInfo.setFullName(g.getUser().getFullName());
			userInfo.setIsJoinedRecently(g.getUser().getIsJoinedRecently());
			userInfo.setIsPrivate(g.getUser().getIsPrivate());
			userInfoMap.put(username, userInfo);
		}
		return userInfo;
		
	}

}
