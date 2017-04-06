package com.sunbin.test.teacher.service;

import java.util.List;

import com.sunbin.test.teacher.pojo.Teacher;

public interface TeacherService {

	@SuppressWarnings("rawtypes")
	public List list();
	
	public int count();
	
	public void save(Teacher teacher);
	
	public void remove(Teacher teacher);
	
	public void update(Teacher teacher);
	
	public Teacher get(Teacher teacher);

}