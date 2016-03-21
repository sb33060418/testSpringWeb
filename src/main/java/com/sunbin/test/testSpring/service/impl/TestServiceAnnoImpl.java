package com.sunbin.test.testSpring.service.impl;

import com.sunbin.test.testSpring.dao.TestDao;
import com.sunbin.test.testSpring.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceAnnoImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	public String test(String string) {
		// TODO Auto-generated method stub
		return "testServiceAnnoImpl.test:"+testDao.test(string);
	}


}
