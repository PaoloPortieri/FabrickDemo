package com.fabrick.demo.dto.bonifico;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Bonifico {
	
    @JsonProperty(value = "accountId")
    @Valid
    @NotNull
	private Creditor creditor;
    
    @JsonProperty(value = "accountId")
	private String executionDate;
    
    @JsonProperty(value = "accountId")
	private String uri;
    
    @JsonProperty(value = "accountId")
    @NotNull
	private String description;
	
	@JsonProperty(value = "accountId")
	@NotNull
	private BigDecimal amount;
	
	@JsonProperty(value = "accountId")
	@NotNull
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
	@Valid
	private TaxRelief taxRelief;
}
