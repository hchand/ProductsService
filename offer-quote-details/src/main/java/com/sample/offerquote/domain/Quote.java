/**
 * 
 */
package com.sample.offerquote.domain;

/**
 * @author chand
 *
 */
public class Quote {
	
	private String reference;
	private double value;
	private Category category;	

	public Quote() {
		super();
	}

	public Quote(String reference, double value, Category category) {
		super();
		this.reference = reference;
		this.value = value;
		this.category = category;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
