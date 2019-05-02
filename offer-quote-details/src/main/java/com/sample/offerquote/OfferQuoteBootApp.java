package com.sample.offerquote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sample.offerquote.controller")
public class OfferQuoteBootApp {
	
	public static void main(String[] args) {
		SpringApplication.run(OfferQuoteBootApp.class, args);
	}

}
