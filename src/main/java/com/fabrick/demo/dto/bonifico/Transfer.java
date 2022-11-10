package com.fabrick.demo.dto.bonifico;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Transfer {
	
    @JsonProperty(value = "accountId")
	private Creditor creditor;
    
    @JsonProperty(value = "accountId")
	private String executionDate;
    
    @JsonProperty(value = "accountId")
	private String uri;
    
    @JsonProperty(value = "accountId")
	private String description;
	
	@JsonProperty(value = "accountId")
	private BigDecimal amount;
	
	@JsonProperty(value = "accountId")
	private String currency;
	
	@JsonProperty(value = "accountId")
	private Boolean isUrgent;
	
	@JsonProperty(value = "accountId")
	private Boolean isInstant;
	
	@JsonProperty(value = "accountId")
	private String feeType;
	
	@JsonProperty(value = "accountId")
	private String feeAccountId;
	
	@JsonProperty(value = "accountId")
	private TaxRelief taxRelief;
}
