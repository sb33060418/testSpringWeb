package com.sunbin.test.testSpring.dao.impl;

import com.sunbin.test.testSpring.dao.TestDao;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoAnnoImpl implements TestDao {

	@Override
	public String test(String string) {
		// TODO Auto-generated method stub
		return "testDaoAnnoImpl.test:"+string;
	}

}
