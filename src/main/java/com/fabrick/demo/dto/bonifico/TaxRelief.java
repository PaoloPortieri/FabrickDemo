package com.fabrick.demo.dto.bonifico;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class TaxRelief {
	
    @JsonProperty(value = "taxReliefId")
	private String taxReliefId;
    
    @JsonProperty(value = "isCondoUpgrade")
    @NotNull
	private boolean isCondoUpgrade;
    
    @JsonProperty(value = "creditorFiscalCode")
    @Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "creditorFiscalCode invalid.")
    @NotNull
	private String creditorFiscalCode;
    
    @JsonProperty(value = "beneficiaryType")
    @NotNull
	private String beneficiaryType;
    
    @JsonProperty(value = "naturalPersonBeneficiary")
    @Valid
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
    
    @JsonProperty(value = "legalPersonBeneficiary")
    @Valid
	private LegalPersonBeneficiary legalPersonBeneficiary;
}
