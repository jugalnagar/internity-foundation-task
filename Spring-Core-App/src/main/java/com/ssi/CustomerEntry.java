package com.ssi;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerEntry {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Code : ");
		int code=sc.nextInt();
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Address : ");
		String address=sc.next();
		
		Customer customer=new Customer(code,name,address);

		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		CustomerDAO dao=context.getBean("customerDAO",CustomerDAOImpl.class);
		
		dao.saveCustomer(customer);
		
		System.out.println("RECORD SUCCESSFULLY STORED.....");
		

	}

}
