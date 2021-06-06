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
import com.clone.instagram.authservice.model.InstaUserInfoRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class FetchInstaaUserDetails {
	@Autowired private RestTemplate restTemplate;
	@Autowired private Gson gson;
	private String instaUserNameApi="https://graph.instagram.com/{user-id}?fields=username,account_type&access_token={ACCESS-TOKEN}";
	private String instaUserNameApi2="https://graph.instagram.com/me?fields=username,account_type&access_token={ACCESS-TOKEN}";
	private String instaUserDetailApi="https://www.instagram.com/{username}/?__a=1";
	private static Map<String,InstaUserInfo> userInfoMap=new HashMap<>();
	public FetchInstaaUserDetails() {
		// TODO Auto-generated constructor stub
	}
	private InstaUserInfo fetchfollowerCount(String username) {
		
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
	public InstaUserInfo getUserDetailsFromUserId(InstaUserInfoRequest instaUserInfoRequest) {

		String url=instaUserNameApi2;
		url=url.replace("{ACCESS-TOKEN}", instaUserInfoRequest.getAccess_token());
		ResponseEntity<Map> responseEntity=restTemplate.getForEntity(url, Map.class);
		String username=(String) responseEntity.getBody().get("username");
		InstaUserInfo details=fetchfollowerCount(username);
		return details;
		
	}

}
