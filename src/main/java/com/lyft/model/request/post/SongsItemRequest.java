package com.lyft.model.request.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SongsItemRequest(

	@JsonProperty("duration")
	int duration,

	@JsonProperty("name")
	String name,

	@JsonProperty("genre")
	String genre,

	@JsonProperty("language")
	String language
) {
}