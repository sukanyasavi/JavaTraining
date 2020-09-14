package com.training.inheritance;

public class Manager extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position="manager";
		int salary=50000;
		Employee e = new Employee();
		
		System.out.println(e.name+e.id+position+salary);
		

	}

}
