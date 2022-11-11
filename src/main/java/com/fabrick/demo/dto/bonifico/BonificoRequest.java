package com.fabrick.demo.dto.bonifico;

import java.math.BigDecimal;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class BonificoRequest {
	
    @JsonProperty(value = "creditor")
    @Valid
    private Creditor creditor;
    
    @JsonProperty(value = "executionDate")
    private String executionDate;
    
    @JsonProperty(value = "uri")
    private String uri;
    
    @JsonProperty(value = "description")
    private String description;
    
    @JsonProperty(value = "amount")
    private BigDecimal amount;
    
    @JsonProperty(value = "currency")
    private String currency;
    
    @JsonProperty(value = "isUrgent")
    private boolean isUrgent;
    
    @JsonProperty(value = "isInstant")
    private boolean isInstant;
    
    @JsonProperty(value = "feeType")
    private String feeType;
    
    @JsonProperty(value = "feeAccountId")
    private String feeAccountId;
    
    @JsonProperty(value = "taxRelief")
    private TaxRelief taxRelief;

}
