package com.sunbin.test.testSpring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunbin.test.testSpring.service.TestService;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "root-context.xml" });
		TestService testService  =(TestService) applicationContext.getBean("testService");
		System.out.println(testService.test("helloWorld"));
	}

}
