package com.fabrick.demo.exception;

import org.springframework.http.HttpStatus;

public class MovimentiException extends RuntimeException {

	private static final long serialVersionUID = 7147043525640688624L;
	private HttpStatus status;
	private String code;
	
	public MovimentiException(HttpStatus status, String code, String errorMessage) {
		super(errorMessage);
		this.status = status;
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
