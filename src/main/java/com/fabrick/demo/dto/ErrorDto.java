package com.fabrick.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class ErrorDto {

    @JsonProperty(value = "accountId")
    private String code;
    
    @JsonProperty(value = "description")
    private String description;
    
    @JsonProperty(value = "params")
    private String params;
	
}
