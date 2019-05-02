/**
 * 
 */
package com.sample.offerquote.domain;

/**
 * @author chand
 *
 */
public class Offer {

	private String taxCode;
	private String iban;
	private String member;
	private double price;
	private Category category;

	public Offer() {
		super();
	}

	public Offer(String taxCode, String iban, String member, double price, Category category) {
		super();
		this.taxCode = taxCode;
		this.iban = iban;
		this.member = member;
		this.price = price;
		this.category = category;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
