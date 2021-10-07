package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	@JsonProperty(value="message")
	ResponseData message;
	
	String status;

	public ResponseData getMessage() {
		return message;
	}

	public void setMessage(ResponseData message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
