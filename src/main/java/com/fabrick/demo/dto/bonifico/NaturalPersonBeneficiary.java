package com.fabrick.demo.dto.bonifico;

import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class NaturalPersonBeneficiary {
	
    @JsonProperty(value = "fiscalCode1")
    @Pattern(regexp= RegexUtils.fiscalCodeValidationRegex, message= "NaturalPersonBeneficiary's fiscalCode1 is not a valid fiscal code.")
	private String fiscalCode1;
    
    @JsonProperty(value = "fiscalCode2")
    @Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "NaturalPersonBeneficiary's fiscalCode2 is not a valid fiscal code.")
	private String fiscalCode2;
    
    @JsonProperty(value = "fiscalCode3")
    @Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "NaturalPersonBeneficiary's fiscalCode3 is not a valid fiscal code.")
	private String fiscalCode3;
    
    @JsonProperty(value = "fiscalCode4")
    @Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "NaturalPersonBeneficiary's fiscalCode4 is not a valid fiscal code.")
	private String fiscalCode4;
    
    @JsonProperty(value = "fiscalCode5")
    @Pattern(regexp = RegexUtils.fiscalCodeValidationRegex, message= "NaturalPersonBeneficiary's fiscalCode5 is not a valid fiscal code.")
	private String fiscalCode5;
}
