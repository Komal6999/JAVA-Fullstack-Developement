package com.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdminDetails")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AdminID")
	private int aid;
	private String Username;
	private String Password;
	
	public Admin() {
	}

	public Admin(int aid, String username, String password) {
		super();
		this.aid = aid;
		this.Username = username;
		this.Password = password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
}
