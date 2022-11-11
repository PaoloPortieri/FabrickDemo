package com.fabrick.demo.dto.bonifico;


import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class LegalPersonBeneficiary {
	
	@JsonProperty(value = "fiscalCode")
	@Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "LegalPersonBeneficiary's fiscalCode invalid.")
	private String fiscalCode;
	
	@JsonProperty(value = "legalRepresentativeFiscalCode")
	@Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "legalRepresentativeFiscalCode invalid.")
	private String legalRepresentativeFiscalCode;
}
