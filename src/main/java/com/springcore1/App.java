package com.springcore1; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/iconfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("oconfig.xml");
//        Student student1 = (Student) context.getBean("student1");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");

//        System.out.println(student1);
//        ((ClassPathXmlApplicationContext) context).close();
		System.out.println(student1);
		System.out.println(student2);

		((ClassPathXmlApplicationContext) context).close();

	}
}
