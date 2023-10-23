package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lfconfig.xml");
//		ApplePie ap = (ApplePie) context.getBean("ap");
//		System.out.println(ap);
		//Shutdown hook is with AbstractApplicationContext
		context.registerShutdownHook();
		
		System.out.println("----------------------");
		
//		Tofurkey tkey = (Tofurkey) context.getBean("tofurkey");
		
//		System.out.println(tkey);
		
		
		Casserole gbc = (Casserole) context.getBean("gbc");
		
		System.out.println(gbc);
		

	}

}
