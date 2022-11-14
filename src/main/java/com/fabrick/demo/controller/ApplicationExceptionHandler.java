package com.fabrick.demo.controller;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fabrick.demo.dto.ErrorContainer;
import com.fabrick.demo.exception.BonificoException;
import com.fabrick.demo.exception.MovimentiException;
import com.fabrick.demo.exception.SaldoException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationExceptionHandler.class);
    
	@ExceptionHandler (value = { BonificoException.class, SaldoException.class, MovimentiException.class })
	protected ResponseEntity<ErrorContainer> bankingException(RuntimeException ex, WebRequest request) {
    	LOG.error("Stepped into bankingException");
    	
    	ErrorContainer errorContainer = new ErrorContainer();
    	errorContainer.getErrorMessages().add(ex.getMessage());
    	
        return new ResponseEntity<ErrorContainer>(errorContainer, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		LOG.error("Stepped into handleMethodArgumentNotValid");
		
		ErrorContainer errorMessages = new ErrorContainer();
		errorMessages.setErrorMessages(
		(ex.getBindingResult().getAllErrors()
				.stream()
				.map(x -> x.getDefaultMessage())
				.collect(Collectors.toList())));
		
		if(!(errorMessages.getErrorMessages().isEmpty())) {
			LOG.error("One or more invalid arguments found: ");
			errorMessages.getErrorMessages().stream()
			.forEach(msg -> {
				LOG.error(msg);
			});
		}
        return new ResponseEntity<Object>(errorMessages, HttpStatus.BAD_REQUEST);
	}
}
