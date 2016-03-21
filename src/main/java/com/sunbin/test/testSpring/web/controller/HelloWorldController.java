package com.sunbin.test.testSpring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "hello world!");
		modelAndView.setViewName("helloWorld");
		return modelAndView;
	}

}
