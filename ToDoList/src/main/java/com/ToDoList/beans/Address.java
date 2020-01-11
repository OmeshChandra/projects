package com.ToDoList.beans;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="ADDRESS")
@Data
public class Address {
	@Id
	@GeneratedValue(generator = "address_uuid")
	@GenericGenerator(name="address_uuid",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ADDRESS_ID",nullable = false,updatable = false)
	private UUID addressId;
	@Column(length = 25,nullable = false,updatable = true)
	private String houseNo;
	@Column(length = 25,nullable = false,updatable = true)
	private String streetNo;
	@Column(length = 25,nullable = false,updatable = true)
	private String area;
	@Column(length = 25,nullable = true,updatable = true)
	private String city;
	@Column(length = 25,nullable = false,updatable = true)
	private String state;
	@Column(length = 25,nullable = false,updatable = true)
	private String country;
	@ManyToOne
	@JoinColumn(name="USER_ID",nullable = false)
	private User user;
}
