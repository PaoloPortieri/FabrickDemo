package com.fabrick.demo.dto.bonifico;


import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class LegalPersonBeneficiary {
	
	@JsonProperty(value = "fiscalCode")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "LegalPersonBeneficiary's fiscalCode invalid.")
	private String fiscalCode;
	
	@JsonProperty(value = "legalRepresentativeFiscalCode")
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "legalRepresentativeFiscalCode invalid.")
	private String legalRepresentativeFiscalCode;
}
