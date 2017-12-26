package com.sunbin.test.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbin.test.teacher.dao.TeacherDao;
import com.sunbin.test.teacher.pojo.Teacher;
import com.sunbin.test.teacher.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	@SuppressWarnings("rawtypes")
	@Override
	public List list() {
		System.out.println("TeacherServiceImpl.list");
		return teacherDao.list();
	}

	@Override
	public int count() {
		System.out.println("TeacherServiceImpl.count");
		return teacherDao.count();
	}

	@Override
	public void save(Teacher teacher) {
		System.out.println("TeacherServiceImpl.save:" + teacher);
		teacherDao.save(teacher);
	}

	@Override
	public void remove(Teacher teacher) {
		System.out.println("TeacherServiceImpl.remove:" + teacher);
		teacherDao.remove(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("TeacherServiceImpl.update:" + teacher);
		teacherDao.update(teacher);
	}

	@Override
	public Teacher get(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("TeacherServiceImpl.get:" + teacher);
		return teacherDao.get(teacher);
	}

}