package com.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWiringXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowirexml/axmlconfig.xml");
		Seller seller = context.getBean("sellerByName",Seller.class);
		System.out.println(seller);
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/autowirexml/axmlconfig.xml");
		Seller seller1 = context1.getBean("sellerByType",Seller.class);
		System.out.println(seller1);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/autowirexml/axmlconfig.xml");
		Seller seller2 = context2.getBean("sellerByConstructor",Seller.class);
		System.out.println(seller2);

	}

}
