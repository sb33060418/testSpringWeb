package com.sunbin.test.testSpring.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunbin.test.testSpring.service.TestService;

public class TestAnno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext applicationContext = 
		          new AnnotationConfigApplicationContext("com.sunbin.test.testSpring");
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext-annonation.xml" });
		TestService testService  =(TestService) applicationContext.getBean(TestService.class);
		System.out.println(testService.test("helloWorldAnno"));
	}

}
