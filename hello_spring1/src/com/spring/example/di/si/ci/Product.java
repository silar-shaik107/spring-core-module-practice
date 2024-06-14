package com.spring.example.di.si.ci;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private int productId;
	private List<String> productName;
	private Set<Long> phoneNumber;
	private Map<String,String>  productItems;
	private boolean isOrderSuccess;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public List<String> getProductName() {
		return productName;
	}
	public void setProductName(List<String> productName) {
		this.productName = productName;
	}
	public Set<Long> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Map<String, String> getProductItems() {
		return productItems;
	}
	public void setProductItems(Map<String, String> productItems) {
		this.productItems = productItems;
	}
	public boolean getisOrderSuccess() {
		return isOrderSuccess;
	}
	public void setisOrderSuccess(boolean isOrderSuccess) {
		this.isOrderSuccess = isOrderSuccess;
	}
	

}
