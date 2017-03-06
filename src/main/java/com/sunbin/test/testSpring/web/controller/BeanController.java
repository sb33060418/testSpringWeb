package com.sunbin.test.testSpring.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.sunbin.test.testSpring.service.TestService;

public class BeanController implements Controller{
	
	private TestService testService;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
//		ServletContext servletContext = request.getSession().getServletContext();
//		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//		TestService testServiceImpl = (TestService)applicationContext.getBean("testServiceImpl");
//		TestService testServiceImpl = SpringContextHolder.getBean("testServiceImpl");
		String param = request.getParameter("param");
		String messsage = testService.test(param);
		System.out.println(messsage);
		modelAndView.addObject("message", messsage);
		modelAndView.setViewName("helloWorld");
		return modelAndView;
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}



}
