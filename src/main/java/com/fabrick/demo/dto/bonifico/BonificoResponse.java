package com.fabrick.demo.dto.bonifico;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class BonificoResponse {

	@JsonProperty(value = "moneyTransferId")
	private String moneyTransferId;
	
	@JsonProperty(value = "status")
    private String status;
	
	@JsonProperty(value = "direction")
    private String direction;
	
	@JsonProperty(value = "creditor")
    private Creditor creditor;
	
	@JsonProperty(value = "debtor")
    private Debtor debtor;
	
	@JsonProperty(value = "cro")
    private String cro;        
	
	@JsonProperty(value = "uri")
    private String uri;
	
	@JsonProperty(value = "trn")
    private String trn;
	
	@JsonProperty(value = "description")
    private String description;
	
	@JsonProperty(value = "createdDatetime")
    private String createdDatetime;
	
	@JsonProperty(value = "accountedDatetime")
    private String accountedDatetime;
	
	@JsonProperty(value = "debtorValueDate")
    private String debtorValueDate;
	
	@JsonProperty(value = "creditorValueDate")
    private String creditorValueDate;
	
	@JsonProperty(value = "amount")
    private Amount amount;
	
	@JsonProperty(value = "isUrgent")
    private boolean isUrgent;
	
	@JsonProperty(value = "isInstant")
    private boolean isInstant;
	
	@JsonProperty(value = "feeType")
    private String feeType;
	
	@JsonProperty(value = "feeAccountId")
    private String feeAccountId;
	
	@JsonProperty(value = "fees")
    private List<Fee> fees;
	
	@JsonProperty(value = "hasTaxRelief")
    private boolean hasTaxRelief;
	
}
