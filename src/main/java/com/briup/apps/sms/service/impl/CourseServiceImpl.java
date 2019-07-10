package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.dao.CourseDao;
import com.briup.apps.sms.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Resource
	private CourseDao courseDao;
	@Override
	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return courseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Course course) throws Exception {
		// TODO Auto-generated method stub
		if(course.getId() == null)
		{
			courseDao.insert(course);
		}
		else
		{
			courseDao.update(course);
		}
	}

}
