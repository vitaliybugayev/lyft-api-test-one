package com.lyft.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Ip(

	@JsonProperty("origin")
	String origin
) {
}