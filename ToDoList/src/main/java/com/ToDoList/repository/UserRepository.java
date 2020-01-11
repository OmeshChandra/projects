package com.ToDoList.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ToDoList.beans.User;
import com.ToDoList.vo.UserVo;

@Repository("userRepo")
public interface UserRepository  extends JpaRepository<User, Serializable>{
	@Query(value="from com.ToDoList.beans.User user where user.mail=:mail and user.password=:password")
	public User getUserByMailAndPassword(@Param(value="mail") String mail,@Param(value="password")String password);
}
