package com.sunbin.test.teacher.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Teacher")  
public class Teacher {

	private int id;
	private int age;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}