package com.example.covid19.data.models;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "new",
    "active",
    "critical",
    "recovered",
    "1M_pop",
    "total"
})
@Generated("jsonschema2pojo")
public class Cases {

    @JsonProperty("new")
    public Object _new;
    @JsonProperty("active")
    public Integer active;
    @JsonProperty("critical")
    public Integer critical;
    @JsonProperty("recovered")
    public Integer recovered;
    @JsonProperty("1M_pop")
    public String _1MPop;
    @JsonProperty("total")
    public Integer total;

}
