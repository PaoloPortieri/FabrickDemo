package com.fabrick.demo.dto.bonifico;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Account {
	
	@JsonProperty(value = "accountCode")
	private String accountCode;
	
	@JsonProperty(value = "bicCode")
    private String bicCode;
}
