package com.example.covid19.data.models;


import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "continent",
    "country",
    "population",
    "cases",
    "deaths",
    "tests",
    "day",
    "time"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("continent")
    public String continent;
    @JsonProperty("country")
    public String country;
    @JsonProperty("population")
    public Integer population;
    @JsonProperty("cases")
    @Valid
    public Cases cases;
    @JsonProperty("deaths")
    @Valid
    public Deaths deaths;
    @JsonProperty("tests")
    @Valid
    public Tests tests;
    @JsonProperty("day")
    public String day;
    @JsonProperty("time")
    public String time;

}
