package com.fabrick.demo.dto.bonifico;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fabrick.demo.utils.RegexUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class Creditor {
	
    @JsonProperty(value = "name")
    @Pattern(regexp = RegexUtils.nameValidationRegex, message = "Creditor name cannot contain invalid characters.")
    @NotNull
	private String name;
    
    @JsonProperty(value = "account")
    @Valid
    @NotNull
    private Account account;
    
    @JsonProperty(value = "address")
    @Valid
    private Address address;
}
