package com.fabrick.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fabrick.demo.dto.ErrorContainer;
import com.fabrick.demo.dto.ErrorDto;
import com.fabrick.demo.exception.BonificoException;
import com.fabrick.demo.exception.MovimentiException;
import com.fabrick.demo.exception.SaldoException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

    
	@ExceptionHandler (value = {BonificoException.class})
	protected ResponseEntity<ErrorDto> bonificoException(RuntimeException ex, WebRequest request) {
    	LOG.error("Stepped into bonificoException");
    	
    	ErrorDto error = new ErrorDto();
    	error.setDescription(ex.getMessage());
    	
        return new ResponseEntity<ErrorDto>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = { SaldoException.class })
	protected ResponseEntity<ErrorContainer> saldoException(RuntimeException ex, WebRequest request) {
		LOG.error("Stepped into saldoException");

		ErrorContainer errorMessages = new ErrorContainer();
		errorMessages.getErrorMessages().add(ex.getMessage());

		return new ResponseEntity<ErrorContainer>(errorMessages, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { MovimentiException.class })
	protected ResponseEntity<ErrorContainer> movimentiException(RuntimeException ex, WebRequest request) {
		LOG.error("Stepped into movimentiException");

		ErrorContainer errorMessages = new ErrorContainer();
		errorMessages.getErrorMessages().add(ex.getMessage());

		return new ResponseEntity<ErrorContainer>(errorMessages, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		LOG.error("Stepped into handleMethodArgumentNotValid");
		
		ErrorContainer errorMessages = new ErrorContainer();
		
		 for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			 errorMessages.getErrorMessages().add(error.ge);
		 }
		
        return new ResponseEntity<Object>("test test test", HttpStatus.BAD_REQUEST);
	}
	
}
