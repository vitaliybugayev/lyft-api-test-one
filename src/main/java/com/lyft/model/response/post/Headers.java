package com.lyft.model.response.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Headers(

	@JsonProperty("Accept")
	String accept,

	@JsonProperty("Cache-Control")
	String cacheControl,

	@JsonProperty("User-Agent")
	String userAgent,

	@JsonProperty("Host")
	String host,

	@JsonProperty("Postman-Token")
	String postmanToken,

	@JsonProperty("Accept-Encoding")
	String acceptEncoding,

	@JsonProperty("Content-Length")
	String contentLength,

	@JsonProperty("X-Amzn-Trace-Id")
	String xAmznTraceId,

	@JsonProperty("Content-Type")
	String contentType
) {
}