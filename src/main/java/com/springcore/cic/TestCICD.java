package com.springcore.cic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCICD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cic/cicdconfig.xml");
		CIC cic = (CIC)context.getBean("cic");
		System.out.println(cic);

	}

}
