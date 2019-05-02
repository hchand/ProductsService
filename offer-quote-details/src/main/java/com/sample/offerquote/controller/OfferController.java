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

import com.sample.offerquote.domain.Category;
import com.sample.offerquote.domain.Offer;

@RestController
@RequestMapping("offers")
public class OfferController extends AbstractRestController {
	
	Logger logger = LoggerFactory.getLogger(OfferController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/{offerId}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Offer> getOffers(@PathVariable String offerId) {
		// Stub offers for the sample project		
		Offer offer = new Offer();		
		if(!StringUtils.isEmpty(offerId) && offerId.equals("11")) {
			logger.info("Found offer product with id 11");
			offer = new Offer("TXN42", "BHN55", "Axa", 100, new Category(11, "OFFER"));
			return generateResponse(offer, DEFAULT_STATUS_OK);
		} 
		return generateResponse(offer, DEFAULT_STATUS_NOT_FOUND);
	}

}
