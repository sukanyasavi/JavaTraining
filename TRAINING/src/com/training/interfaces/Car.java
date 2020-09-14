package com.training.interfaces;

public class Car implements Vehicle{

	@Override
	public void run() {
		System.out.println("runs at 330");
		
	}

	@Override
	public void wheels() {
		
		System.out.println("has 4 wheels");
		
	}

}
