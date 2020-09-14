package com.training.loops;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner sc=new Scanner(System.in);
		while(ch==0) {
			
		
		
System.out.println("enter a number to know whether it is even or odd");
int n=sc.nextInt();
if(n%2==0)
{
	System.out.println("the number you have entered is even");
}
else
{
	System.out.println("the number you have entered is odd");
}

System.out.println("press 0 to continue");
ch=sc.nextInt();
		}
		

		
	}

}
