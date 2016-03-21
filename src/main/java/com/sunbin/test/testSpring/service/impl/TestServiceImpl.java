package com.sunbin.test.testSpring.service.impl;

import com.sunbin.test.testSpring.dao.TestDao;
import com.sunbin.test.testSpring.service.TestService;


public class TestServiceImpl implements TestService {

	private TestDao testDao;
	
	public String test(String string) {
		// TODO Auto-generated method stub
		return "testServiceImpl.test:"+testDao.test(string);
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

}
