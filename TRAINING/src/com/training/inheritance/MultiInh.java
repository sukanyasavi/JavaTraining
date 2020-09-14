package com.training.inheritance;

public class MultiInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.eat();
		d.bark();
		Babydog bd = new Babydog();
		bd.bark();bd.eat();bd.weep();
		
	}

}
