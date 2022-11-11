package com.fabrick.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;

@NoArgsConstructor 
public class ErrorDto {

    @JsonProperty(value = "accountId")
    private String code;
    
    @JsonProperty(value = "description")
    private String description;
    
    @JsonProperty(value = "params")
    private String params;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
	
    
}
