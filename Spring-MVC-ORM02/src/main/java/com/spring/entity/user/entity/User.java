package com.spring.entity.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User12")
public class User implements Comparable<User>{
	
	@Id
	private Integer id;
	private String name;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int compareTo(User user) {
		// TODO Auto-generated method stub
		return this.id.compareTo(user.id);
	}
	
	

}
