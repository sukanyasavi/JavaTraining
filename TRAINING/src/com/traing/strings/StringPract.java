package com.traing.strings;

public class StringPract {

	public static void main(String[] args) {
	char[] s= {'a','x'};
	String st=new String(s);
	System.out.println(st);
	String s1="rama";
	System.out.println(s1);
	String s2=new String("sita");
	System.out.println(s2);
	System.out.println(s1+" is husband of "+s2);
    
	String s3="Raja Ram Mohan Roy";
	System.out.println(s3.charAt(3));
	System.out.println(s3.contains("Raj"));
	System.out.println(s3.toUpperCase());
	System.out.println(s3.substring(6));
	System.out.println(s3.substring(3,9));
	System.out.println(s3.toLowerCase());
	System.out.println(s3.concat(" was a great person"));
	System.out.println(s3);
	
	
	String s4="rama";
	String s5="sita";
	String s6="Rama";
	System.out.println(s4.equalsIgnoreCase(s6));
	System.out.println("rama"+"sita");
	
	String s7="     ravana";
	System.out.println(s7.trim());
	System.out.println(s7.length());
	
	StringBuffer sb = new StringBuffer("sachin");
	System.out.println(sb);
	sb.append(" tendulkar");
	sb.append(" is a great batsman");
	System.out.println(sb);
	//System.out.println(sb.reverse());
	System.out.println(sb.replace(1, 5, "sgdg"));
	
	StringBuilder sbu = new StringBuilder("sachin");
	System.out.println(sbu);
	sbu.append(" tendulkar");
	sbu.append(" is a great batsman");
	System.out.println(sbu);
	//System.out.println(sb.reverse());
	System.out.println(sbu.replace(1, 5, "sgdg"));
	

	}

}
