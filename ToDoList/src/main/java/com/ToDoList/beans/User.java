package com.ToDoList.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")	
	private UUID userId;
	@Column(name="FIRST_NAME",nullable = false)
	private String firstName;
	@Column(name="MIDDLE_NAME",nullable = true)
	private String middleName;
	@Column(name="LAST_NAME", nullable = false)
	private String lastName;
	@Column(name="PASSWORD",nullable = false)
	private String password;
	@Column(name="CONTACT",nullable = false,length=10)
	private String contact;
	@Column(name="MAIL",nullable = true)
	private String mail;
	@OneToMany
	private List<Address> addresses;
	@ElementCollection
	@JoinTable(name="NOTE",joinColumns = @JoinColumn(name="USER_ID"))
	private List<ToDoNote> todoList=new ArrayList<ToDoNote>();
}
