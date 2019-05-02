package com.sample.offerquote.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sample.offerquote.domain.Category;
import com.sample.offerquote.domain.Quote;

@RestController
@RequestMapping("quotes")
public class QuoteController extends AbstractRestController {
	
	Logger logger = LoggerFactory.getLogger(QuoteController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/{quoteId}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Quote> getOffers(@PathVariable String quoteId) throws JsonProcessingException {
		// Stub offers for the sample project, Call back end for real scenario		
		Quote quote = new Quote();		
		if(!StringUtils.isEmpty(quoteId) && quoteId.equals("44")) {
			logger.info("Found quote product with id 44");
			quote = new Quote("REF677", 1000, new Category(44, "QUOTE"));
			return generateResponse(quote, DEFAULT_STATUS_OK);
		}		
		return generateResponse(quote, DEFAULT_STATUS_NOT_FOUND);
	}

}
