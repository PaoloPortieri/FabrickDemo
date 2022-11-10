package com.fabrick.demo.dto.bonifico;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Creditor {
	
    @JsonProperty(value = "name")
	private String name;
    
    @JsonProperty(value = "account")
    private Account account;
    
    @JsonProperty(value = "address")
    private Address address;
}
