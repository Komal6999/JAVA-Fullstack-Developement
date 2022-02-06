package com.simplilearn.inheritance;

public interface First {

	default void show()
	{
		System.out.println("Default Method of First");
	}
}