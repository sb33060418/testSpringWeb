package com.sunbin.test.testSpring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.sunbin.test.testSpring.service.TestService;

public class BeanController implements Controller {

	private TestService testService;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
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
