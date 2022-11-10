package com.fabrick.demo.dto.bonifico;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class NaturalPersonBeneficiary {
	
    @JsonProperty(value = "fiscalCode1")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "NaturalPersonBeneficiary's fiscalCode1 invalid.")
	private String fiscalCode1;
    
    @JsonProperty(value = "fiscalCode2")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "NaturalPersonBeneficiary's fiscalCode2 invalid.")
	private String fiscalCode2;
    
    @JsonProperty(value = "fiscalCode3")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "NaturalPersonBeneficiary's fiscalCode3 invalid.")
	private String fiscalCode3;
    
    @JsonProperty(value = "fiscalCode4")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "NaturalPersonBeneficiary's fiscalCode4 invalid.")
	private String fiscalCode4;
    
    @JsonProperty(value = "fiscalCode5")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "NaturalPersonBeneficiary's fiscalCode5 invalid.")
	private String fiscalCode5;
}
