package com.training.loops;

import java.util.Scanner;

public class SwitchOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ch = 0;
		while(ch==0) {
			System.out.println("enter the month between 1 to 12 to know number of days in that month");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		switch(n)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("31 days");
			break;}
		
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("30 days");
			break;}
		case 2:{
			System.out.println("enter the year");
			int y = sc.nextInt();
			if((y%4==0 && y%100!=0)||(y%400==0))
			
				System.out.println("29 days");
			
			else
			
				System.out.println("28 days");
			break;
		}
			
			//default:System.out.println("invalid input");
			
		}
		
	
		System.out.println("enter 0 to continue");
		 ch=sc.nextInt();}
	}
}
