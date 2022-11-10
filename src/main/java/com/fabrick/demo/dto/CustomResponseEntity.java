package com.fabrick.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CustomResponseEntity<T> {

    @JsonProperty(value = "status")
    private String status;
    @JsonProperty(value = "errors")
    private List<ErrorDto> errors;
    @JsonProperty(value = "payload")
    private T payload;

    public CustomResponseEntity(String status, List<ErrorDto> errors, T payload) {
        this.status = status;
        this.errors = errors;
        this.payload = payload;
    }
}
