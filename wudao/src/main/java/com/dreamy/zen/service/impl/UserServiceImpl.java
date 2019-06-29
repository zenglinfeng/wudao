package com.dreamy.zen.service.impl;


import com.dreamy.zen.dao.UserDao;
import com.dreamy.zen.domain.UserDomain;
import com.dreamy.zen.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	public UserDao userDao;
	@Override
	public int insertUser(UserDomain user) {
		// TODO Auto-generated method stub
		return userDao.insert(user);
	}

	@Override
	public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
		PageHelper.startPage(pageNum,pageSize);
		List<UserDomain> userDomains = userDao.selectUsers();
		PageInfo result = new PageInfo(userDomains);
		return result;
	}
	@Override
	public List<UserDomain> findAllUser(){
		List<UserDomain> list = userDao.selectUsers();
		return list;
	}

	/*@Override
	public User findUserById(Integer id) {
		
		return userDao.findUserById(id);
	}
	@Override
	public int updateUser(User user) {
		
		return userDao.updateUser(user);
	}
	@Override
	public int deleteUserById(Integer id) {
		
		return userDao.deleteUserByid(id);
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}*/

}
