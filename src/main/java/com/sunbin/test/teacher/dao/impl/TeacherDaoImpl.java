package com.sunbin.test.teacher.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sunbin.test.teacher.dao.TeacherDao;
import com.sunbin.test.teacher.pojo.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao {

	private static List<Teacher> teachers = new ArrayList<Teacher>();

	@SuppressWarnings("rawtypes")
	@Override
	public List list() {
		System.out.println("TeacherDaoImpl.list:" + teachers);
		return teachers;
	}

	@Override
	public int count() {
		System.out.println("TeacherDaoImpl.count:" + teachers.size());
		return teachers.size();
	}

	@Override
	public void save(Teacher teacher) {
		System.out.println("TeacherDaoImpl.save:" + teacher);
		int teacherId = 1;
		if (teachers.size() > 0) {
			teacherId = teachers.get(teachers.size() - 1).getId() + 1;
		}
		teacher.setId(teacherId);
		teachers.add(teacher);
	}

	@Override
	public void remove(Teacher teacher) {
		System.out.println("TeacherDaoImpl.remove:" + teacher);
		int teacherId = teacher.getId();
		for (int i = 0; i < teachers.size(); i++) {
			Teacher teacherI = teachers.get(i);
			if (teacherI.getId() == teacherId) {
				teachers.remove(i);
				return;
			}
		}
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("TeacherDaoImpl.update:" + teacher);
		int teacherId = teacher.getId();
		for (int i = 0; i < teachers.size(); i++) {
			Teacher teacherI = teachers.get(i);
			if (teacherI.getId() == teacherId) {
				teachers.remove(i);
				teachers.add(i, teacher);
				return;
			}
		}
	}

	@Override
	public Teacher get(Teacher teacher) {
		System.out.println("TeacherDaoImpl.get:" + teacher);
		int teacherId = teacher.getId();
		for (int i = 0; i < teachers.size(); i++) {
			Teacher teacherI = teachers.get(i);
			if (teacherI.getId() == teacherId) {
				return teacherI;
			}
		}
		return null;
	}

}
