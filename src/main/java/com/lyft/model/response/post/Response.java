package com.lyft.model.response.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Response(

	@JsonProperty("args")
	Args args,

	@JsonProperty("form")
	Form form,

	@JsonProperty("files")
	Files files
) {
}