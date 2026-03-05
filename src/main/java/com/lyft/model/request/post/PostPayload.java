package com.lyft.model.request.post;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record PostPayload(

	@JsonProperty("country")
	String country,

	@JsonProperty("regions")
	List<String> regions,

	@JsonProperty("songs")
	List<SongsItemRequest> songs,

	@JsonProperty("record_name")
	String recordName,

	@JsonProperty("location")
	String location,

	@JsonProperty("id")
	String id
) {
}