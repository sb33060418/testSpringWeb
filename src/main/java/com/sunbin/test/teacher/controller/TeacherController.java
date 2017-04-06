package com.sunbin.test.teacher.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunbin.test.teacher.pojo.Teacher;
import com.sunbin.test.teacher.service.TeacherService;


@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		modelAndView.addObject("list", teacherService.list());
		return modelAndView;
	}

	@RequestMapping("/count")
	public ModelAndView count(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		modelAndView.addObject("count", teacherService.count());
		return modelAndView;
	}

	@RequestMapping("/save")
	public ModelAndView save(Teacher teacher,HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		teacherService.save(teacher);
		modelAndView.addObject("list", teacherService.list());
		return modelAndView;
	}

	@RequestMapping("/remove")
	public ModelAndView remove(Teacher teacher,HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		teacherService.remove(teacher);
		modelAndView.addObject("list", teacherService.list());
		return modelAndView;
	}

	@RequestMapping("/update")
	public ModelAndView update(Teacher teacher,HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		teacherService.update(teacher);
		modelAndView.addObject("list", teacherService.list());
		return modelAndView;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(Teacher teacher,HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
		modelAndView.addObject("teacher", teacherService.get(teacher));
		return modelAndView;
	}

}
