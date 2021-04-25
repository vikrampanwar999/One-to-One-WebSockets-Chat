package com.clone.instagram.authservice.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstaUserInfoRequest {
	
	private String access_token;
	private String user_id;
	
}
