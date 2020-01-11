package com.ToDoList.vo;

import lombok.Data;

@Data
public class UserVo {
	private Integer userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	private String password2;
	private String contact;
	private String mail;
}
