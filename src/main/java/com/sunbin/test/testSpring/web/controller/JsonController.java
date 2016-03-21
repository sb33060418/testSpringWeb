package com.sunbin.test.testSpring.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.sunbin.test.testSpring.service.TestService;

@org.springframework.stereotype.Controller
public class JsonController implements Controller{
	@Autowired
	public TestService testService;
	

	@Override
	@RequestMapping(value="/json",method={RequestMethod.GET})
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(new MappingJackson2JsonView());
		//new MappingJackson2JsonView()
		view.addObject("status", "y");
		view.addObject("info", "success");
		return view;
	}
	@RequestMapping(value="/json1",method={RequestMethod.GET})
	@ResponseBody 
	public Map testJson(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("status", "n");
		map.put("info", "failure");
		return map;
	}


}
