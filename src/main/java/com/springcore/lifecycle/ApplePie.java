package com.springcore.lifecycle;

import java.security.Timestamp;
import java.time.Instant;

public class ApplePie {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price value" + "\t" + this.getClass().getSimpleName());
		this.price = price;
	}

	@Override
	public String toString() {
		return "AppliePie [price=" + price + "]";
	}

	public ApplePie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplePie(double price) {
		super();
		this.price = price;
	}
	
	public void hey() {
		System.out.println("inside init-I'm getting created :) at " + System. currentTimeMillis()+ "\t" + this.getClass().getSimpleName());
		
	}
	
	public void bye() {
		System.out.println("inside destroy-Oops my time has come :( at " + System. currentTimeMillis()+ "\t"+ this.getClass().getSimpleName());
		
	}
	
	

}
