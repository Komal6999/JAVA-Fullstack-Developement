package com.simplilearn.annoyinner;

public class AnnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Car Started from anonymous class");
				
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Car stopped from anonymous class");
				
			}

			@Override
			public void stop1() {
				// TODO Auto-generated method stub
				
			}
			
		
		};
		c.start();
		c.stop();
		c.stop1();

	}

}
