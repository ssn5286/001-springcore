package com.springcore.autowirexml.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWiringXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowirexml/ann/annconfig.xml");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);
		
//		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/autowirexml/ann/annconfig.xml");
//		Emp seller1 = context1.getBean("sellerByType",Emp.class);
//		System.out.println(seller1);
//		
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/autowirexml/ann/annconfig.xml");
//		Emp seller2 = context2.getBean("sellerByConstructor",Emp.class);
//		System.out.println(seller2);

	}

}
