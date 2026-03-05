package com.lyft.model.response.post;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Json(

	@JsonProperty("country")
	String country,

	@JsonProperty("regions")
	List<String> regions,

	@JsonProperty("songs")
	List<SongsItem> songs,

	@JsonProperty("location")
	String location,

	@JsonProperty("record_name")
	String recordName,

	@JsonProperty("id")
	String id
) {
}