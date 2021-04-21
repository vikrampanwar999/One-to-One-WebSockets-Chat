
package com.clone.instagram.authservice.fetchdata.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "biography",
    "blocked_by_viewer",
    "restricted_by_viewer",
    "country_block",
    "external_url",
    "external_url_linkshimmed",
    "edge_followed_by",
    "fbid",
    "followed_by_viewer",
    "edge_follow",
    "follows_viewer",
    "full_name",
    "has_ar_effects",
    "has_clips",
    "has_guides",
    "has_channel",
    "has_blocked_viewer",
    "highlight_reel_count",
    "has_requested_viewer",
    "id",
    "is_business_account",
    "is_professional_account",
    "is_joined_recently",
    "business_category_name",
    "overall_category_name",
    "category_enum",
    "category_name",
    "is_private",
    "is_verified",
    "edge_mutual_followed_by",
    "profile_pic_url",
    "profile_pic_url_hd",
    "requested_by_viewer",
    "should_show_category",
    "username",
    "connected_fb_page",
    "edge_felix_video_timeline",
    "edge_owner_to_timeline_media",
    "edge_saved_media",
    "edge_media_collections"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("biography")
    private String biography;
    @JsonProperty("blocked_by_viewer")
    private Boolean blockedByViewer;
    @JsonProperty("restricted_by_viewer")
    private Boolean restrictedByViewer;
    @JsonProperty("country_block")
    private Boolean countryBlock;
    @JsonProperty("external_url")
    private Object externalUrl;
    @JsonProperty("external_url_linkshimmed")
    private Object externalUrlLinkshimmed;
    @JsonProperty("edge_followed_by")
    private EdgeFollowedBy edgeFollowedBy;
    @JsonProperty("fbid")
    private String fbid;
    @JsonProperty("followed_by_viewer")
    private Boolean followedByViewer;
    @JsonProperty("edge_follow")
    private EdgeFollow edgeFollow;
    @JsonProperty("follows_viewer")
    private Boolean followsViewer;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("has_ar_effects")
    private Boolean hasArEffects;
    @JsonProperty("has_clips")
    private Boolean hasClips;
    @JsonProperty("has_guides")
    private Boolean hasGuides;
    @JsonProperty("has_channel")
    private Boolean hasChannel;
    @JsonProperty("has_blocked_viewer")
    private Boolean hasBlockedViewer;
    @JsonProperty("highlight_reel_count")
    private Integer highlightReelCount;
    @JsonProperty("has_requested_viewer")
    private Boolean hasRequestedViewer;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_business_account")
    private Boolean isBusinessAccount;
    @JsonProperty("is_professional_account")
    private Boolean isProfessionalAccount;
    @JsonProperty("is_joined_recently")
    private Boolean isJoinedRecently;
    @JsonProperty("business_category_name")
    private Object businessCategoryName;
    @JsonProperty("overall_category_name")
    private Object overallCategoryName;
    @JsonProperty("category_enum")
    private Object categoryEnum;
    @JsonProperty("category_name")
    private Object categoryName;
    @JsonProperty("is_private")
    private Boolean isPrivate;
    @JsonProperty("is_verified")
    private Boolean isVerified;
    @JsonProperty("edge_mutual_followed_by")
    private EdgeMutualFollowedBy edgeMutualFollowedBy;
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    @JsonProperty("profile_pic_url_hd")
    private String profilePicUrlHd;
    @JsonProperty("requested_by_viewer")
    private Boolean requestedByViewer;
    @JsonProperty("should_show_category")
    private Boolean shouldShowCategory;
    @JsonProperty("username")
    private String username;
    @JsonProperty("connected_fb_page")
    private Object connectedFbPage;
    @JsonProperty("edge_felix_video_timeline")
    private EdgeFelixVideoTimeline edgeFelixVideoTimeline;
    @JsonProperty("edge_owner_to_timeline_media")
    private EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia;
    @JsonProperty("edge_saved_media")
    private EdgeSavedMedia edgeSavedMedia;
    @JsonProperty("edge_media_collections")
    private EdgeMediaCollections edgeMediaCollections;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("biography")
    public String getBiography() {
        return biography;
    }

    @JsonProperty("biography")
    public void setBiography(String biography) {
        this.biography = biography;
    }

    @JsonProperty("blocked_by_viewer")
    public Boolean getBlockedByViewer() {
        return blockedByViewer;
    }

    @JsonProperty("blocked_by_viewer")
    public void setBlockedByViewer(Boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    @JsonProperty("restricted_by_viewer")
    public Boolean getRestrictedByViewer() {
        return restrictedByViewer;
    }

    @JsonProperty("restricted_by_viewer")
    public void setRestrictedByViewer(Boolean restrictedByViewer) {
        this.restrictedByViewer = restrictedByViewer;
    }

    @JsonProperty("country_block")
    public Boolean getCountryBlock() {
        return countryBlock;
    }

    @JsonProperty("country_block")
    public void setCountryBlock(Boolean countryBlock) {
        this.countryBlock = countryBlock;
    }

    @JsonProperty("external_url")
    public Object getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty("external_url")
    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonProperty("external_url_linkshimmed")
    public Object getExternalUrlLinkshimmed() {
        return externalUrlLinkshimmed;
    }

    @JsonProperty("external_url_linkshimmed")
    public void setExternalUrlLinkshimmed(Object externalUrlLinkshimmed) {
        this.externalUrlLinkshimmed = externalUrlLinkshimmed;
    }

    @JsonProperty("edge_followed_by")
    public EdgeFollowedBy getEdgeFollowedBy() {
        return edgeFollowedBy;
    }

    @JsonProperty("edge_followed_by")
    public void setEdgeFollowedBy(EdgeFollowedBy edgeFollowedBy) {
        this.edgeFollowedBy = edgeFollowedBy;
    }

    @JsonProperty("fbid")
    public String getFbid() {
        return fbid;
    }

    @JsonProperty("fbid")
    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    @JsonProperty("followed_by_viewer")
    public Boolean getFollowedByViewer() {
        return followedByViewer;
    }

    @JsonProperty("followed_by_viewer")
    public void setFollowedByViewer(Boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    @JsonProperty("edge_follow")
    public EdgeFollow getEdgeFollow() {
        return edgeFollow;
    }

    @JsonProperty("edge_follow")
    public void setEdgeFollow(EdgeFollow edgeFollow) {
        this.edgeFollow = edgeFollow;
    }

    @JsonProperty("follows_viewer")
    public Boolean getFollowsViewer() {
        return followsViewer;
    }

    @JsonProperty("follows_viewer")
    public void setFollowsViewer(Boolean followsViewer) {
        this.followsViewer = followsViewer;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("has_ar_effects")
    public Boolean getHasArEffects() {
        return hasArEffects;
    }

    @JsonProperty("has_ar_effects")
    public void setHasArEffects(Boolean hasArEffects) {
        this.hasArEffects = hasArEffects;
    }

    @JsonProperty("has_clips")
    public Boolean getHasClips() {
        return hasClips;
    }

    @JsonProperty("has_clips")
    public void setHasClips(Boolean hasClips) {
        this.hasClips = hasClips;
    }

    @JsonProperty("has_guides")
    public Boolean getHasGuides() {
        return hasGuides;
    }

    @JsonProperty("has_guides")
    public void setHasGuides(Boolean hasGuides) {
        this.hasGuides = hasGuides;
    }

    @JsonProperty("has_channel")
    public Boolean getHasChannel() {
        return hasChannel;
    }

    @JsonProperty("has_channel")
    public void setHasChannel(Boolean hasChannel) {
        this.hasChannel = hasChannel;
    }

    @JsonProperty("has_blocked_viewer")
    public Boolean getHasBlockedViewer() {
        return hasBlockedViewer;
    }

    @JsonProperty("has_blocked_viewer")
    public void setHasBlockedViewer(Boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    @JsonProperty("highlight_reel_count")
    public Integer getHighlightReelCount() {
        return highlightReelCount;
    }

    @JsonProperty("highlight_reel_count")
    public void setHighlightReelCount(Integer highlightReelCount) {
        this.highlightReelCount = highlightReelCount;
    }

    @JsonProperty("has_requested_viewer")
    public Boolean getHasRequestedViewer() {
        return hasRequestedViewer;
    }

    @JsonProperty("has_requested_viewer")
    public void setHasRequestedViewer(Boolean hasRequestedViewer) {
        this.hasRequestedViewer = hasRequestedViewer;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("is_business_account")
    public Boolean getIsBusinessAccount() {
        return isBusinessAccount;
    }

    @JsonProperty("is_business_account")
    public void setIsBusinessAccount(Boolean isBusinessAccount) {
        this.isBusinessAccount = isBusinessAccount;
    }

    @JsonProperty("is_professional_account")
    public Boolean getIsProfessionalAccount() {
        return isProfessionalAccount;
    }

    @JsonProperty("is_professional_account")
    public void setIsProfessionalAccount(Boolean isProfessionalAccount) {
        this.isProfessionalAccount = isProfessionalAccount;
    }

    @JsonProperty("is_joined_recently")
    public Boolean getIsJoinedRecently() {
        return isJoinedRecently;
    }

    @JsonProperty("is_joined_recently")
    public void setIsJoinedRecently(Boolean isJoinedRecently) {
        this.isJoinedRecently = isJoinedRecently;
    }

    @JsonProperty("business_category_name")
    public Object getBusinessCategoryName() {
        return businessCategoryName;
    }

    @JsonProperty("business_category_name")
    public void setBusinessCategoryName(Object businessCategoryName) {
        this.businessCategoryName = businessCategoryName;
    }

    @JsonProperty("overall_category_name")
    public Object getOverallCategoryName() {
        return overallCategoryName;
    }

    @JsonProperty("overall_category_name")
    public void setOverallCategoryName(Object overallCategoryName) {
        this.overallCategoryName = overallCategoryName;
    }

    @JsonProperty("category_enum")
    public Object getCategoryEnum() {
        return categoryEnum;
    }

    @JsonProperty("category_enum")
    public void setCategoryEnum(Object categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    @JsonProperty("category_name")
    public Object getCategoryName() {
        return categoryName;
    }

    @JsonProperty("category_name")
    public void setCategoryName(Object categoryName) {
        this.categoryName = categoryName;
    }

    @JsonProperty("is_private")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("is_private")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("is_verified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    @JsonProperty("is_verified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @JsonProperty("edge_mutual_followed_by")
    public EdgeMutualFollowedBy getEdgeMutualFollowedBy() {
        return edgeMutualFollowedBy;
    }

    @JsonProperty("edge_mutual_followed_by")
    public void setEdgeMutualFollowedBy(EdgeMutualFollowedBy edgeMutualFollowedBy) {
        this.edgeMutualFollowedBy = edgeMutualFollowedBy;
    }

    @JsonProperty("profile_pic_url")
    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    @JsonProperty("profile_pic_url")
    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    @JsonProperty("profile_pic_url_hd")
    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    @JsonProperty("profile_pic_url_hd")
    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    @JsonProperty("requested_by_viewer")
    public Boolean getRequestedByViewer() {
        return requestedByViewer;
    }

    @JsonProperty("requested_by_viewer")
    public void setRequestedByViewer(Boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    @JsonProperty("should_show_category")
    public Boolean getShouldShowCategory() {
        return shouldShowCategory;
    }

    @JsonProperty("should_show_category")
    public void setShouldShowCategory(Boolean shouldShowCategory) {
        this.shouldShowCategory = shouldShowCategory;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("connected_fb_page")
    public Object getConnectedFbPage() {
        return connectedFbPage;
    }

    @JsonProperty("connected_fb_page")
    public void setConnectedFbPage(Object connectedFbPage) {
        this.connectedFbPage = connectedFbPage;
    }

    @JsonProperty("edge_felix_video_timeline")
    public EdgeFelixVideoTimeline getEdgeFelixVideoTimeline() {
        return edgeFelixVideoTimeline;
    }

    @JsonProperty("edge_felix_video_timeline")
    public void setEdgeFelixVideoTimeline(EdgeFelixVideoTimeline edgeFelixVideoTimeline) {
        this.edgeFelixVideoTimeline = edgeFelixVideoTimeline;
    }

    @JsonProperty("edge_owner_to_timeline_media")
    public EdgeOwnerToTimelineMedia getEdgeOwnerToTimelineMedia() {
        return edgeOwnerToTimelineMedia;
    }

    @JsonProperty("edge_owner_to_timeline_media")
    public void setEdgeOwnerToTimelineMedia(EdgeOwnerToTimelineMedia edgeOwnerToTimelineMedia) {
        this.edgeOwnerToTimelineMedia = edgeOwnerToTimelineMedia;
    }

    @JsonProperty("edge_saved_media")
    public EdgeSavedMedia getEdgeSavedMedia() {
        return edgeSavedMedia;
    }

    @JsonProperty("edge_saved_media")
    public void setEdgeSavedMedia(EdgeSavedMedia edgeSavedMedia) {
        this.edgeSavedMedia = edgeSavedMedia;
    }

    @JsonProperty("edge_media_collections")
    public EdgeMediaCollections getEdgeMediaCollections() {
        return edgeMediaCollections;
    }

    @JsonProperty("edge_media_collections")
    public void setEdgeMediaCollections(EdgeMediaCollections edgeMediaCollections) {
        this.edgeMediaCollections = edgeMediaCollections;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
