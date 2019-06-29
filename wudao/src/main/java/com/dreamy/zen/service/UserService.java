package com.dreamy.zen.service;


import com.dreamy.zen.domain.UserDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;



public interface UserService {
   /**
    * 添加用户
    * @param user
    * @return
    */
	public int insertUser(UserDomain user);
    /**
     * 根据id查找用户
     * @param id
     * @return
     */
/*	public UserDomain findUserById(Integer id);
	
	public List<UserDomain> findAll();
	*//**
	 * 根据id更新用户
	 * @return
	 *//*
	public  int updateUser(UserDomain user);
	*//**
	 * 根据id删除用户
	 * @param id
	 * @return
	 *//*
	public int deleteUserById(Integer id);*/
	PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
	List <UserDomain> findAllUser();
}
