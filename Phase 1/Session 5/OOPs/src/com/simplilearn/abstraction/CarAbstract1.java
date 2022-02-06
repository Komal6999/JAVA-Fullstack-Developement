package com.simplilearn.abstraction;


public abstract class CarAbstract1 implements CarDesign{

	private String model;
	public CarAbstract1(String model)
	{
		this.model=model;
	}
	public void CarAbstract(String name) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void start() {
		System.out.println("Car Started");
		
	}
	@Override
	public void stop() {
		System.out.println("car stopped");
		
	}
	abstract public void powerEngine();

}
