package com.company.lvc;

public class AccessSpecifier {

	protected void display()
	{
		System.out.println("You are accessing protected method of this class");
	

	}
	
	private void test()
	{
		System.out.println("My Private Method");
	}
	
	public void hello()
	{
		System.out.println("My Public Method");
	}
	
	void world()
	{
		System.out.println("Default Method");
	}

	public static void main(String[] args)
	{
		AccessSpecifier obj = new AccessSpecifier();
		obj.display();
		obj.test();
		obj.hello();
		obj.world();
		
	}
}
