package com.clone.instagram.authservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.clone.instagram.authservice.model.facebook.FacebookPicture;
import com.clone.instagram.authservice.model.facebook.FacebookUser;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstaUserInfo {
	@Id
    private String id;
	private String instaUserName;
	private Integer followers;
	private Integer followings;
	private Integer mutualFollowers;
	private String fbId;
	private String instaId;
	private Boolean isVerified;
	private String fullName;
	private Boolean isJoinedRecently;
	private Boolean isPrivate;
	private String instaProfilePicUrl;

}
