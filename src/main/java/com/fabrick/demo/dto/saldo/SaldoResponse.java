package com.fabrick.demo.dto.saldo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
public class SaldoResponse {


    @JsonProperty(value = "accountId")
    private String accountId;
    
    @JsonProperty(value = "iban")
    private String iban;
    
    @JsonProperty(value = "abiCode")
    private String abiCode;
    
    @JsonProperty(value = "cabCode")
    private String cabCode;
    
    @JsonProperty(value = "countryCode")
    private String countryCode;
    
    @JsonProperty(value = "internationalCin")
    private String internationalCin;
    
    @JsonProperty(value = "nationalCin")
    private String nationalCin;
    
    @JsonProperty(value = "account")
    private String account;

    @JsonProperty(value = "alias")
    private String alias;

    @JsonProperty(value = "productName")
    private String productName;

    @JsonProperty(value = "holderName")
    private String holderName;

    @JsonProperty(value = "activatedDate")
    private String activatedDate;
    
    @JsonProperty(value = "currency")
    private String currency;

}
