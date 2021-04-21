
package com.clone.instagram.authservice.fetchdata.model;

import java.util.HashMap;
import java.util.List;
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
    "count",
    "page_info",
    "edges"
})
@Generated("jsonschema2pojo")
public class EdgeOwnerToTimelineMedia {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("page_info")
    private PageInfo__1 pageInfo;
    @JsonProperty("edges")
    private List<Object> edges = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("page_info")
    public PageInfo__1 getPageInfo() {
        return pageInfo;
    }

    @JsonProperty("page_info")
    public void setPageInfo(PageInfo__1 pageInfo) {
        this.pageInfo = pageInfo;
    }

    @JsonProperty("edges")
    public List<Object> getEdges() {
        return edges;
    }

    @JsonProperty("edges")
    public void setEdges(List<Object> edges) {
        this.edges = edges;
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
