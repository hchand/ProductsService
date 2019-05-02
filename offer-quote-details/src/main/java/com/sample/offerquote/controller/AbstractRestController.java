/**
 * 
 */
package com.sample.offerquote.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author chand
 *
 */
public class AbstractRestController {

	protected static final HttpStatus DEFAULT_STATUS_OK = HttpStatus.OK;
	protected static final HttpStatus DEFAULT_STATUS_NOT_FOUND = HttpStatus.NOT_FOUND;

	protected <T> ResponseEntity<T> generateResponse(T object, HttpStatus httpStatus) {
		return new ResponseEntity<>(object, httpStatus);
	}
}
