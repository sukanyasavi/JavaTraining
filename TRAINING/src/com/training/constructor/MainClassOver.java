package com.training.constructor;

public class MainClassOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading("ankita",12);
		ConstructorOverloading co2 = new ConstructorOverloading(co1);//copy constructor
		
		System.out.println(co.getName());
		System.out.println(co.getId());
		co1.display();
		co2.display();
		
		
	}

}
