package com.fabrick.demo.exception;

import org.springframework.http.HttpStatus;

public class SaldoException extends RuntimeException {

	private static final long serialVersionUID = 4584657415597912850L;
	private HttpStatus status;
	private String code;
	
	public SaldoException(HttpStatus status, String code, String errorMessage) {
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
}
