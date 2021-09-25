package com.saraya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user_list")
@Data
public class UserInformation {
	
	public UserInformation() {
		super();
	}
	public UserInformation(String email, String name, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}
	@Id 
	@Column
	private String email;
	@Column
	private String name;
	@Column
	private String password;
	
}
