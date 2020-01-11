package com.ToDoList.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ToDoNote {
	@Column(name="DATE",nullable = false,updatable = true)
	private Date date;
	@Column(name="NOTE",nullable = false,updatable = true,length = 100)
	private String note;
}
