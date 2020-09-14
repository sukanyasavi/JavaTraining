package com.training.loops;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to know whether it is even or odd");
		int n=sc.nextInt();
		String output=(n%2==0)?"even":"odd";
		System.out.println(output);
	}

}
