package com.cg.mmbank.pojo;

public abstract class Customer {
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String dateOfBirth;
	private int customerId;

	private static int custId;

	static {
		custId = 200;
	}

	{
		this.customerId = ++custId;
	}

	public Customer(String customerName, long contactNumber, String emailId, String dateOfBirth, int customerId) {
		super();
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public static int getCustId() {
		return custId;
	}

	public static void setCustId(int custId) {
		Customer.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ ", dateOfBirth=" + dateOfBirth + ", customerId=" + customerId + "]";
	}

}