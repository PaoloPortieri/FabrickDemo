package com.fabrick.demo.dto.bonifico;

import java.math.BigDecimal;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fee {
	
	@JsonProperty(value = "feeCode")
	private String feeCode;
	
	@JsonProperty(value = "description")
	private String description;
	
	@JsonProperty(value = "amount")
	@Pattern(regexp = "^[0-9]*$", message= "The amount value cannot contain anything other than numbers.")
	private BigDecimal amount;
	
	@JsonProperty(value = "currency")
	private String currency;
}
