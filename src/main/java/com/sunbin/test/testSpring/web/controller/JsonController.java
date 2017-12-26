package com.sunbin.test.testSpring.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.sunbin.test.testSpring.service.TestService;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = "/json")
public class JsonController {
	@Autowired
	public TestService testService;

	@RequestMapping(value = "/y", method = { RequestMethod.GET })
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(new MappingJackson2JsonView());
		// new MappingJackson2JsonView()
		view.addObject("status", "y");
		view.addObject("info", "success");
		return view;
	}

	@RequestMapping(value = "/n", method = { RequestMethod.GET })
	@ResponseBody
	public Map testJson(HttpServletRequest request, HttpServletResponse arg1)
			throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("status", "n");
		map.put("info", "failure");
		return map;
	}

}
