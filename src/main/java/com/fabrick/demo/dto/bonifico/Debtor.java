package com.fabrick.demo.dto.bonifico;

import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Debtor {
	
	@JsonProperty(value = "name")
    @Pattern(regexp = RegexUtils.nameValidationRegex, message = "Creditor name cannot contain invalid characters.")
	private String name;
	
	@JsonProperty(value = "account")
    private Account account;
}
