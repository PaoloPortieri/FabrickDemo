package com.fabrick.demo.controller;

import com.fabrick.demo.dto.CustomResponseEntity;
import com.fabrick.demo.dto.bonifico.BonificoRequest;
import com.fabrick.demo.dto.bonifico.BonificoResponse;
import com.fabrick.demo.dto.movimenti.MovimentiResponse;
import com.fabrick.demo.dto.saldo.SaldoResponse;
import com.fabrick.demo.exception.BonificoException;
import com.fabrick.demo.exception.MovimentiException;
import com.fabrick.demo.exception.SaldoException;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/bank") 
public class BankController extends ResponseEntityExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(BankController.class);
    
    @Value("${app.endpoints.saldoUrl}")
    private String saldoUrl;
    
    @Value("${app.endpoints.bonificoUrl}")
    private String bonificoUrl;
    
    @Value("${app.endpoints.movimentiUrl}")
    private String movimentiUrl;
    
    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/saldo")
    public ResponseEntity<CustomResponseEntity<SaldoResponse>> getLetturaSaldo(){

    	ResponseEntity<CustomResponseEntity<SaldoResponse>> response = null;
        LOG.info("/saldo endpoint START, forwarding call to the following url: {}", saldoUrl);
        
        try {
        HttpHeaders headers = new HttpHeaders();
        // set additional headers here other than from the defaults ones already in RestTemplateConfiguration
        HttpEntity<String> entity = new HttpEntity<>(headers);

        response = restTemplate.exchange(
                saldoUrl,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<CustomResponseEntity<SaldoResponse>>(){});
        } catch (Exception e) {
			throw new SaldoException(HttpStatus.INTERNAL_SERVER_ERROR, "500", e.getMessage());
		}
        
        LOG.info("/saldo endpoint END, response retrieved: {}", response);
        return response;

    }
    
    @PostMapping("/bonifico")
    public ResponseEntity<CustomResponseEntity<BonificoResponse>> getBonifico(@RequestBody BonificoRequest body){
    	
    	LOG.info("/bonifico endpoint START, forwarding call to the following url: {}", bonificoUrl);
    	ResponseEntity<CustomResponseEntity<BonificoResponse>> response = null;
    	
        try {
        	HttpHeaders headers = new HttpHeaders();
            // set additional headers here other than from the defaults ones already in RestTemplateConfiguration

            HttpEntity<?> entity = new HttpEntity<BonificoRequest>(body, headers);
        	response = restTemplate.exchange(
                    bonificoUrl,
                    HttpMethod.POST,
                    entity,
                    new ParameterizedTypeReference<CustomResponseEntity<BonificoResponse>>(){});
		} catch (BadRequest e) {
			throw new BonificoException(HttpStatus.BAD_REQUEST, "400", e.getMessage());
		}
    	
        LOG.info("/bonifico endpoint END, response retrieved: {}", response);
    	return response;
    }
    
    @GetMapping("/movimenti")
    public ResponseEntity<CustomResponseEntity<MovimentiResponse>> getMovimenti(@RequestParam String fromAccountingDate,
    		@RequestParam String toAccountingDate){
    	LOG.info("/movimenti endpoint START, forwarding call to the following url: {}", movimentiUrl);

    	ResponseEntity<CustomResponseEntity<MovimentiResponse>> response = null;
    	
    	try {
	        HttpHeaders headers = new HttpHeaders();
	        // set additional headers here other than from the defaults ones already in RestTemplateConfiguration
	        HttpEntity<String> entity = new HttpEntity<>(headers);
	
	        String url = UriComponentsBuilder.fromHttpUrl(movimentiUrl)
	                .queryParam("fromAccountingDate", "{fromAccountingDate}")
	                .queryParam("toAccountingDate", "{toAccountingDate}")
	                .encode()
	                .toUriString();
	        
	        Map<String, String> params = new HashMap<>();
	        params.put("fromAccountingDate", fromAccountingDate);
	      	params.put("toAccountingDate", toAccountingDate);
	        
	        response = restTemplate.exchange(
	        		url,
	                HttpMethod.GET,
	                entity,
	                new ParameterizedTypeReference<CustomResponseEntity<MovimentiResponse>>(){},
	                params);        
    	} catch (Exception e) {
    		throw new MovimentiException(HttpStatus.INTERNAL_SERVER_ERROR, "500", e.getMessage());
    	}
        
        LOG.info("/movimenti endpoint END, response retrieved: {}", response);
        return response;
    }

}


