package com.traing.operator;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		System.out.println(~a);//(-10)-1=-11
		System.out.println(a+b);

		System.out.println(a*b);

		System.out.println(a-b);

		System.out.println(b/a);

		System.out.println(b%a);
		
		System.out.println(a++);
		System.out.println(a++ + b++);
		System.out.println(a+b);
		
		
		if(a>5 && b>10)
		{
			System.out.println("true");
		}
		System.out.println(a<<2);//10*2^2
		int x=56;
		int y=50;
		int small=(x<y)?x:y;
		System.out.println(small);
	}

}
