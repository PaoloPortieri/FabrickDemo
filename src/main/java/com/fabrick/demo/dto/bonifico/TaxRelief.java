package com.fabrick.demo.dto.bonifico;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
    @Pattern(regexp="^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message= "creditorFiscalCode invalid.")
    @NotNull
	private String creditorFiscalCode;
    
    @JsonProperty(value = "beneficiaryType")
    @NotNull
	private String beneficiaryType;
    
    @JsonProperty(value = "naturalPersonBeneficiary")
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
    
    @JsonProperty(value = "legalPersonBeneficiary")
	private LegalPersonBeneficiary legalPersonBeneficiary;
}
