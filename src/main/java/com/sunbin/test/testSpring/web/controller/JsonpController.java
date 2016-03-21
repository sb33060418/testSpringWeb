package com.sunbin.test.testSpring.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


@org.springframework.stereotype.Controller
public class JsonpController implements Controller{

	@Override
	@RequestMapping(value="/jsonp",method={RequestMethod.GET})
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(new MappingJackson2JsonView());
		view.addObject("status", "y");
		return view;
	}


}
