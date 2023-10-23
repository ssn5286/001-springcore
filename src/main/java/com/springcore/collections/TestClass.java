package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Test Class");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/icconfig.xml");

		Emp emp = (Emp) context.getBean("Emp");
		System.out.println(emp);

	}

}
