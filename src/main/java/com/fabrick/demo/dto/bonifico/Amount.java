package com.fabrick.demo.dto.bonifico;

import java.math.BigDecimal;

import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Amount {
	
	@JsonProperty(value = "debtorAmount")
	@Pattern(regexp = RegexUtils.amountValidationRegex, message= "The debtorAmount value cannot contain anything other than numbers.")
	private BigDecimal debtorAmount;
	
	@JsonProperty(value = "debtorCurrency")
	private String debtorCurrency;
	
	@Pattern(regexp = RegexUtils.amountValidationRegex, message= "The creditorAmount value cannot contain anything other than numbers.")
	@JsonProperty(value = "creditorAmount")
	private BigDecimal creditorAmount;
	
	@JsonProperty(value = "creditorCurrency")
	private String creditorCurrency;
	
	@JsonProperty(value = "creditorCurrencyDate")
	private String creditorCurrencyDate;
	
	@JsonProperty(value = "exchangeRate")
	private BigDecimal exchangeRate;
}
