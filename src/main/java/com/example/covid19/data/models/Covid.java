package com.example.covid19.data.models;


import java.util.List;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get",
    "parameters",
    "errors",
    "results",
    "response"
})
@Generated("jsonschema2pojo")
public class Covid {

    @JsonProperty("get")
    public String get;
    @JsonProperty("parameters")
    @Valid
    public Parameters parameters;
    @JsonProperty("errors")
    @Valid
    public List<Object> errors;
    @JsonProperty("results")
    public Integer results;
    @JsonProperty("response")
    @Valid
    public List<Response> response;

}
