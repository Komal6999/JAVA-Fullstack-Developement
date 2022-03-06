package com.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CustomerID")
	private int cid;
	private String Username;
	private String Password;
	private int Age;
	private String CityofResidence;
	
	public Customer() {
	}

	public Customer(int cid, String username, String password, int age, String cityofResidence) {
		super();
		this.cid = cid;
		this.Username = username;
		this.Password = password;
		this.Age = age;
		this.CityofResidence = cityofResidence;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getCityofResidence() {
		return CityofResidence;
	}

	public void setCityofResidence(String cityofResidence) {
		this.CityofResidence = cityofResidence;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", Username=" + Username + ", Password=" + Password + ", Age=" + Age
				+ ", CityofResidence=" + CityofResidence + "]";
	}
	
	
}
