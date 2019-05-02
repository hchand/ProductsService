/**
 * 
 */
package com.sample.offerquote.domain;

/**
 * @author chand
 *
 */
public class Category {
	
	private int id;
	private String productType;
	
	public Category() {
		super();		
	}
	
	public Category(int id, String productType) {
		super();
		this.id = id;
		this.productType = productType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}
