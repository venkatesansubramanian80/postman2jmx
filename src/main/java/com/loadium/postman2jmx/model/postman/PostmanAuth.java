package com.loadium.postman2jmx.model.postman;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostmanAuth {
    @JsonProperty("type")
    private String type;
    @JsonProperty("basic")
    private List<PostmanBasic> basic = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<PostmanBasic> getBasic() {
        return basic;
    }

    public void setBasic(List<PostmanBasic> basic) {
        this.basic = basic;
    }
}
