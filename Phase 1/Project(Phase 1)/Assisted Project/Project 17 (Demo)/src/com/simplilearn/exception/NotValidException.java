package com.simplilearn.exception;

public class NotValidException extends Exception{

	public NotValidException(String msg) {
		//pass msg from child class to parent class constructor
		super(msg);
	}
}
