package com.fabrick.demo.dto.saldo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *     {
 *         "accountId": "14930637",
 *             "iban": "IT22D3706978430115706240270",
 *             "abiCode": "37069",
 *             "cabCode": "78430",
 *             "countryCode": "IT",
 *             "internationalCin": "22",
 *             "nationalCin": "D",
 *             "account": "115706240270",
 *             "alias": "Company main account",
 *             "productName": "Generic company cash account",
 *             "holderName": "ACME Inc.",
 *             "activatedDate": "2008-12-25",
 *             "currency": "EUR"
 *     }
 */
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
