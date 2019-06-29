package com.dreamy.zen.dao;

import com.dreamy.zen.domain.UserDomain;

import java.util.List;

public interface UserDao {
	int   insert (UserDomain record);
	List<UserDomain> selectUsers();
}
