package com.example.covid19.data.models;


import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "new",
    "1M_pop",
    "total"
})
@Generated("jsonschema2pojo")
public class Deaths {

    @JsonProperty("new")
    public Object _new;
    @JsonProperty("1M_pop")
    public String _1MPop;
    @JsonProperty("total")
    public Integer total;

}
