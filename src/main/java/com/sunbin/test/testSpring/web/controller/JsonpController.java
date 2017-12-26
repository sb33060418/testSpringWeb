package com.sunbin.test.testSpring.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;

@Controller
public class JsonpController {

	@RequestMapping(value = "/jsonp", method = { RequestMethod.GET })
	@ResponseBody
	public Object jsonp(HttpServletRequest request,
			HttpServletResponse response, String callback) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("status", "y");
		// 如果不存在callback这个请求参数，说明不是跨域请求，直接返回结果json
		if (callback == null || callback.length() == 0) {
			return map;
		} else {
			// 存在callback参数，则需要支持jsonp调用，并设置回调函数
			MappingJacksonValue value = new MappingJacksonValue(map);
			value.setJsonpFunction(callback);
			return value;
		}
	}
}
