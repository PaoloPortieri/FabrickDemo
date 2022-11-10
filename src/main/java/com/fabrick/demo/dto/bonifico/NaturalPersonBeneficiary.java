package com.fabrick.demo.dto.bonifico;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class NaturalPersonBeneficiary {
	
    @JsonProperty(value = "fiscalCode1")
	private String fiscalCode1;
    
    @JsonProperty(value = "fiscalCode2")
	private String fiscalCode2;
    
    @JsonProperty(value = "fiscalCode3")
	private String fiscalCode3;
    
    @JsonProperty(value = "fiscalCode4")
	private String fiscalCode4;
    
    @JsonProperty(value = "fiscalCode5")
	private String fiscalCode5;
}
