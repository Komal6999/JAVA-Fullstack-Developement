package com.project.lockedme;

public class Main {
	
	/* Enter your desierd Directory path */
	public static final String path = "C:\\Users\\Komal\\Downloads\\Main";
	
	public static void main(String[] args)
	{
		Menus menu = new Menus();
		menu.introScreen();
		menu.mainMenu();
	}

}
