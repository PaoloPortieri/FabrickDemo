package com.fabrick.demo.dto.bonifico;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
	
    @JsonProperty(value = "address")
	private String address;
    
    @JsonProperty(value = "city")
    private String city;
    
    @JsonProperty(value = "countryCode")
    private String countryCode;
}
