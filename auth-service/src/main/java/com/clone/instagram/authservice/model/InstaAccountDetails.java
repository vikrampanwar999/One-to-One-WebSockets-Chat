package com.clone.instagram.authservice.model;

import java.time.Instant;
import java.util.Set;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class InstaAccountDetails {
	
	
    @Id
    private String id;
    @NotBlank
    private String userName;
    @LastModifiedDate
    private Instant updatedAt;



}
