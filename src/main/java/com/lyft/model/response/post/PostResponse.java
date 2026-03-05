package com.lyft.model.response.post;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record PostResponse(
        //This is not List<Args>
        //Jackson (the library for JSON mapping) tried to find an array in the response,
        // but found an object instead, so it gave an error.
        @JsonProperty("args") Args args,
        //Same issue
        @JsonProperty("headers") Headers headers,

        @JsonProperty("data") String data,
        //Same issue
        @JsonProperty("form") Form form,

        @JsonProperty("origin") String origin,

        @JsonProperty("files") Files files,

        @JsonProperty("json") Json json,

        @JsonProperty("url") String url) {
}