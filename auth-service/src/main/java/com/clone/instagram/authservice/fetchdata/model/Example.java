
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
    "logging_page_id",
    "show_suggested_profiles",
    "show_follow_dialog",
    "graphql",
    "toast_content_on_load",
    "show_view_shop",
    "profile_pic_edit_sync_props",
    "always_show_message_button_to_pro_account"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("logging_page_id")
    private String loggingPageId;
    @JsonProperty("show_suggested_profiles")
    private Boolean showSuggestedProfiles;
    @JsonProperty("show_follow_dialog")
    private Boolean showFollowDialog;
    @JsonProperty("graphql")
    private Graphql graphql;
    @JsonProperty("toast_content_on_load")
    private Object toastContentOnLoad;
    @JsonProperty("show_view_shop")
    private Boolean showViewShop;
    @JsonProperty("profile_pic_edit_sync_props")
    private Object profilePicEditSyncProps;
    @JsonProperty("always_show_message_button_to_pro_account")
    private Boolean alwaysShowMessageButtonToProAccount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("logging_page_id")
    public String getLoggingPageId() {
        return loggingPageId;
    }

    @JsonProperty("logging_page_id")
    public void setLoggingPageId(String loggingPageId) {
        this.loggingPageId = loggingPageId;
    }

    @JsonProperty("show_suggested_profiles")
    public Boolean getShowSuggestedProfiles() {
        return showSuggestedProfiles;
    }

    @JsonProperty("show_suggested_profiles")
    public void setShowSuggestedProfiles(Boolean showSuggestedProfiles) {
        this.showSuggestedProfiles = showSuggestedProfiles;
    }

    @JsonProperty("show_follow_dialog")
    public Boolean getShowFollowDialog() {
        return showFollowDialog;
    }

    @JsonProperty("show_follow_dialog")
    public void setShowFollowDialog(Boolean showFollowDialog) {
        this.showFollowDialog = showFollowDialog;
    }

    @JsonProperty("graphql")
    public Graphql getGraphql() {
        return graphql;
    }

    @JsonProperty("graphql")
    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    @JsonProperty("toast_content_on_load")
    public Object getToastContentOnLoad() {
        return toastContentOnLoad;
    }

    @JsonProperty("toast_content_on_load")
    public void setToastContentOnLoad(Object toastContentOnLoad) {
        this.toastContentOnLoad = toastContentOnLoad;
    }

    @JsonProperty("show_view_shop")
    public Boolean getShowViewShop() {
        return showViewShop;
    }

    @JsonProperty("show_view_shop")
    public void setShowViewShop(Boolean showViewShop) {
        this.showViewShop = showViewShop;
    }

    @JsonProperty("profile_pic_edit_sync_props")
    public Object getProfilePicEditSyncProps() {
        return profilePicEditSyncProps;
    }

    @JsonProperty("profile_pic_edit_sync_props")
    public void setProfilePicEditSyncProps(Object profilePicEditSyncProps) {
        this.profilePicEditSyncProps = profilePicEditSyncProps;
    }

    @JsonProperty("always_show_message_button_to_pro_account")
    public Boolean getAlwaysShowMessageButtonToProAccount() {
        return alwaysShowMessageButtonToProAccount;
    }

    @JsonProperty("always_show_message_button_to_pro_account")
    public void setAlwaysShowMessageButtonToProAccount(Boolean alwaysShowMessageButtonToProAccount) {
        this.alwaysShowMessageButtonToProAccount = alwaysShowMessageButtonToProAccount;
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
