package com.springcore.autowirexml.ann;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	`
	@Autowired
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Address constructor");		
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Address setAddress");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
