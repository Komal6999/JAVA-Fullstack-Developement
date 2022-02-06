package com.simplilearn.serialization;

import java.io.Serializable;

//pojo plain old java object
public class Demo implements Serializable{

	private int id;
	private String fname;
	private String lname;
	private transient String email;//avoid serialization
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(int id, String fname, String lname, String email) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	
}
