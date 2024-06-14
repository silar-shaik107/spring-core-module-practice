package com.spring.di.ci;

import java.util.Set;

public class AccountDetails {
	private String name;
	private double balance;
	private Set<String> mobile;
	private Address costumerAddress;
	public AccountDetails(String name, double balance, Set<String> mobile, Address costumerAddress) {
		super();
		this.name = name;
		this.balance = balance;
		this.mobile = mobile;
		this.costumerAddress = costumerAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<String> getMobile() {
		return mobile;
	}
	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}
	public Address getCostumerAddress() {
		return costumerAddress;
	}
	public void setCostumerAddress(Address costumerAddress) {
		this.costumerAddress = costumerAddress;
	}

}
