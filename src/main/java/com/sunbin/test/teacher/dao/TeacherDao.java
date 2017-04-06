package com.sunbin.test.teacher.dao;

import java.util.List;

import com.sunbin.test.teacher.pojo.Teacher;

public interface TeacherDao {

	@SuppressWarnings("rawtypes")
	public List list();
	
	public int count();
	
	public void save(Teacher teacher);
	
	public void remove(Teacher teacher);
	
	public void update(Teacher teacher);
	
	public Teacher get(Teacher teacher);

}