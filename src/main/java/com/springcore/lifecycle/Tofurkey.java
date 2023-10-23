package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tofurkey implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Tofurkey(double price) {
		super();
		this.price = price;
	}

	public Tofurkey() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tofurkey [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init at " + System. currentTimeMillis() + "\t"+  this.getClass().getSimpleName());
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy at " + System. currentTimeMillis()+ "\t" + this.getClass().getSimpleName());
		
	}
	
	

}
