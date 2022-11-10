package com.fabrick.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fabrick.demo.dto.ErrorMessage;
import com.fabrick.demo.exception.BonificoException;
import com.fabrick.demo.exception.MovimentiException;
import com.fabrick.demo.exception.SaldoException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

	@ExceptionHandler (value = {BonificoException.class})
	protected ResponseEntity<ErrorMessage> bonificoException(BonificoException ex, WebRequest request) {
    	LOG.error("Stepped into balanceException");

    	ErrorMessage errorMessage = new ErrorMessage();
    	errorMessage.setStatusCode(ex.getCode());
    	errorMessage.setMessage(ex.getMessage());
    	errorMessage.setTimestamp(new Date());
        return new ResponseEntity<ErrorMessage>(errorMessage,ex.getStatus());
	}
	
	@ExceptionHandler (value = {SaldoException.class})
	protected ResponseEntity<ErrorMessage> saldoException(SaldoException ex, WebRequest request) {
    	LOG.error("Stepped into balanceException");

    	ErrorMessage errorMessage = new ErrorMessage();
    	errorMessage.setStatusCode(ex.getCode());
    	errorMessage.setMessage(ex.getMessage());
    	errorMessage.setTimestamp(new Date());
        return new ResponseEntity<ErrorMessage>(errorMessage,ex.getStatus());
	}
	
	@ExceptionHandler (value = {MovimentiException.class})
	protected ResponseEntity<ErrorMessage> movimentiException(MovimentiException ex, WebRequest request) {
    	LOG.error("Stepped into balanceException");

    	ErrorMessage errorMessage = new ErrorMessage();
    	errorMessage.setStatusCode(ex.getCode());
    	errorMessage.setMessage(ex.getMessage());
    	errorMessage.setTimestamp(new Date());
        return new ResponseEntity<ErrorMessage>(errorMessage,ex.getStatus());
	}
}
