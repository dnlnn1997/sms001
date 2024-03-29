package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.dao.UserRoleDao;
import com.briup.apps.sms.service.UserRoleService;
@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Resource
	private UserRoleDao userRoleDao;
	@Override
	public List<UserRole> selectAll() {
		// TODO Auto-generated method stub
		return userRoleDao.selectAll();
	}

	@Override
	public void saveOrUpdate(UserRole userRole) throws Exception {
		// TODO Auto-generated method stub
		if(userRole.getId() == null)
		{
			userRoleDao.insert(userRole);
		}
		else
		{
			userRoleDao.update(userRole);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		userRoleDao.deleteById(id);
	}
	

}
