
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
    "has_next_page",
    "end_cursor"
})
@Generated("jsonschema2pojo")
public class PageInfo__2 {

    @JsonProperty("has_next_page")
    private Boolean hasNextPage;
    @JsonProperty("end_cursor")
    private Object endCursor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("has_next_page")
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    @JsonProperty("has_next_page")
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    @JsonProperty("end_cursor")
    public Object getEndCursor() {
        return endCursor;
    }

    @JsonProperty("end_cursor")
    public void setEndCursor(Object endCursor) {
        this.endCursor = endCursor;
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
