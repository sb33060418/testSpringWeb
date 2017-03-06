package com.sunbin.test.testSpring.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.sunbin.test.testSpring.service.TestService;

@org.springframework.stereotype.Controller
@RequestMapping(value="/test")
public class TestController implements Controller{
	@Autowired
	public TestService testService;
	JsonProcessingException a;
	@RequestMapping(value="/index",method={RequestMethod.GET})
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "test/index");
		modelAndView.setViewName("helloWorld");
		return modelAndView;
	}
	@RequestMapping(value="/test")
	public ModelAndView test(HttpServletRequest request,
			HttpServletResponse reponse) throws Exception {
		// TODO Auto-generated method stub
		String param = request.getParameter("param");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", testService.test(param));
		modelAndView.setViewName("helloWorld");
		return modelAndView;
	}

}
