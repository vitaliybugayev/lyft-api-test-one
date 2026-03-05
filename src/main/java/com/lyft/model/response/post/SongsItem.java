package com.lyft.model.response.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SongsItem(

	@JsonProperty("duration")
	int duration,

	@JsonProperty("genre")
	String genre,

	@JsonProperty("name")
	String name,

	@JsonProperty("language")
	String language
) {
}