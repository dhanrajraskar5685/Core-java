package com.exponent.bankapplication.model;

public class Account {
	private int accountNO;
	private String accountName;
	private long aadharcard;
	private String pancard;
	private long mobileno;
	private double accountBalance;
	public int getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(int accountNO) {
		this.accountNO = accountNO;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
