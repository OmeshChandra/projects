package com.ToDoList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ToDoList.beans.User;
import com.ToDoList.repository.UserRepository;
import com.ToDoList.vo.UserVo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {
	@Autowired
	@Qualifier("userRepo")
	private UserRepository userRepository;

	public Boolean getUserVerified(String mail, String password) {
		User user = userRepository.getUserByMailAndPassword(mail, password);
		return (user != null) ? true : false;
	}

	public void saveUser(UserVo userVo) {
		User user = new User();
		user.setFirstName(userVo.getFirstName());
		user.setMiddleName(userVo.getMiddleName());
		user.setLastName(userVo.getLastName());
		user.setContact(userVo.getContact());
		user.setMail(userVo.getMail());
		user.setPassword(userVo.getPassword());
		userRepository.save(user);
	}
}
