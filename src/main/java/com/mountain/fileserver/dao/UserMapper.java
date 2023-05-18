package com.mountain.fileserver.dao;

import com.mountain.fileserver.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper()
public interface UserMapper {

		void insertUser(User user);

		void deleteUserById(User user);

		User findUserById(User user);

		void changeUserStatusById(User user);

	}
