package com.springcore.autowirexml;

public class Seller {
	private Address address;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(Address address) {
		super();
		System.out.println("Inside Emp Constructor");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
