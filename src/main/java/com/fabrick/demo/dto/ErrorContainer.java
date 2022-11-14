package com.fabrick.demo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

public class ErrorContainer {
	
	@JsonProperty(value = "statusCode")
	private String statusCode;
	
	@JsonProperty(value = "timestamp")
	private Date timestamp;
	
	@JsonProperty(value = "errorMessages")
	private List<String> errorMessages;
	
	public ErrorContainer() {
		this.errorMessages = new ArrayList<>();
	}

	public ErrorContainer(String statusCode, Date timestamp, List<String> errorMessages) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.errorMessages = new ArrayList<>();
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
}
