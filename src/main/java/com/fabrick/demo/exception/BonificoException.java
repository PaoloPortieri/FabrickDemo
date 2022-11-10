package com.fabrick.demo.exception;

import org.springframework.http.HttpStatus;

public class BonificoException extends RuntimeException {

	private static final long serialVersionUID = 2849836877898556167L;
	private HttpStatus status;
	private String code;
	
	public BonificoException(HttpStatus status, String code, String errorMessage) {
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
