package com.fabrick.demo.dto.bonifico;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class LegalPersonBeneficiary {
	
	@JsonProperty(value = "fiscalCode")
	private String fiscalCode;
	
	@JsonProperty(value = "legalRepresentativeFiscalCode")
	private String legalRepresentativeFiscalCode;
}
