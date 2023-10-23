package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Casserole {
	private String kindOf;

	public Casserole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Casserole(String kindOf) {
		super();
		this.kindOf = kindOf;
	}

	public String getKindOf() {
		return kindOf;
	}

	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}

	@Override
	public String toString() {
		return "Casserole [kindOf=" + kindOf + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside start/int of " + this.getClass().getSimpleName());
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside end/destroy of " + this.getClass().getSimpleName());
		
	}

}
