package com.training.interfaces;

public class Bike implements Vehicle{

	@Override
	public void run()
	{
		System.out.println("runs at 200 speed");
		
	}

	@Override
	public void wheels() 
	{
	 	System.out.println("has 2 wheels");
	}

}
