package com.fabrick.demo.dto.bonifico;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class TaxRelief {
	
    @JsonProperty(value = "taxReliefId")
	private String taxReliefId;
    
    @JsonProperty(value = "isCondoUpgrade")
	private Boolean isCondoUpgrade;
    
    @JsonProperty(value = "creditorFiscalCode")
	private String creditorFiscalCode;
    
    @JsonProperty(value = "beneficiaryType")
	private String beneficiaryType;
    
    @JsonProperty(value = "naturalPersonBeneficiary")
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
    
    @JsonProperty(value = "legalPersonBeneficiary")
	private LegalPersonBeneficiary legalPersonBeneficiary;
}
