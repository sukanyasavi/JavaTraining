package com.training.arrays;

import java.util.Arrays;

public class PrintArr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		for(int a1:a)
		{
			System.out.println(a1);
		}
		String[] b= {"abc","xyz"};
		System.out.println(Arrays.toString(b));
		int[][] c=new int[2][2];
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=30;
		c[1][1]=40;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			System.out.println(c[i][j]);
		}
		System.out.println(Arrays.deepToString(c));
		
		int[] y= {1,2,3,4};
		for(int i=0;i<y.length;i++)
		{
		System.out.println(y[i]);	
		}
		 char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        //declaring a destination array  
	        char[] copyTo = new char[7];  
	        //copying array using System.arraycopy() method  
	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
	        //printing the destination array  
	        System.out.println(String.valueOf(copyTo)); 
		
	        String cust="mary";
	        String[] item={"trousers","pants","shirts"};
	        for(String i:item)
	        {
	        	System.out.println("items are "+i);
	        	System.out.println(cust+" purchased "+item[1]);
	        }
	        
		
		
		
	}
	
	}
