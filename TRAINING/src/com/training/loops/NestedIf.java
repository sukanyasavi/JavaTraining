package com.training.loops;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		while(ch==0) {
		
		System.out.println("enter a number to know your grade");
		int n=sc.nextInt();
		if(n<50)
		{
			System.out.println("fail");
		}
		else if(n>=50 && n<60)
		{
			System.out.println("D grade");
		}
		else if(n>=60 && n<70)
		{
			System.out.println("C grade");
		}
		else if(n>=70 && n<80)
		{
			System.out.println("B grade");
		}
		else if(n>=80 && n<90)
		{
			System.out.println("A grade");
		}
		else if(n>=90 && n<=100)
		{
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println("Invalid");
		}
		System.out.println("enter 0 to continue");
		ch=sc.nextInt();
	}}
catch(Exception e)
		{
	System.out.println("invalid");
		}
}}
