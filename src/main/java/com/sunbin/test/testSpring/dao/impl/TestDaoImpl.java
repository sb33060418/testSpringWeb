package com.sunbin.test.testSpring.dao.impl;

import com.sunbin.test.testSpring.dao.TestDao;


public class TestDaoImpl implements TestDao {

	@Override
	public String test(String string) {
		// TODO Auto-generated method stub
		return "testDaoImpl.test:"+string;
	}

}
