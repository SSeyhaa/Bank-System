package com.ha.java.service;

import java.util.List;

import com.ha.java.dto.UserDto;

public interface UserService {

	UserDto postUser(UserDto userDto);
	
	UserDto getUser(Long id);
	
	UserDto putUser(Long id, UserDto userDto);
	
	UserDto deleteUser(Long id);
	
	List<UserDto> getUsers(Long branchId);
	
}
