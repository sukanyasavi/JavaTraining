package com.training.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		try
		{
			
			System.out.println("enter the numerator");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("enter the denominator");
			int d=sc.nextInt();
			int res=n/d;
			System.out.println(res);
			System.out.println("enter the size of array");
			int size=sc.nextInt();
			int a[]=new int[size];
            System.out.println("enter the elements");
            int ele=sc.nextInt();
            System.out.println("enter the index");
            int i=sc.nextInt();
            a[i]=ele;
            System.out.println("element inserted");
		}  
            
            catch(ArithmeticException ae)
            {
            	System.out.println("you cannot divide by zero");
            }
            catch(NegativeArraySizeException nae)
            {
            	System.out.println("be positive");
            }
            catch(InputMismatchException ime )
            {
            	System.out.println("do not missmatch");
            }
            catch(ArrayIndexOutOfBoundsException ioe)
            {
            	System.out.println("be in your limit");
            }
            catch(Exception e)
            {
            	System.out.println("invalid input");
            }
        
            
            
            
			
	}

	
}
