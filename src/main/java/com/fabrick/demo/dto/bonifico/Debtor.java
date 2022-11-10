package com.fabrick.demo.dto.bonifico;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Debtor {
	
	@JsonProperty(value = "name")
    @Pattern(regexp = "^[A-Za-z !]*$", message = "Creditor name cannot contain invalid characters.")
	private String name;
	
	@JsonProperty(value = "account")
    private Account account;
}
