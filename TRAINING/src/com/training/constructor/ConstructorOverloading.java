package com.training.constructor;

public class ConstructorOverloading {

	
		private String name;
		private int id;
		
		ConstructorOverloading()
		{
			
		}
		ConstructorOverloading(String name,int id)
		{
			this.name=name;
			this.id=id;
		}
      ConstructorOverloading(ConstructorOverloading co1) {
			id=co1.id;
			name=co1.name;// TODO Auto-generated constructor stub
		}
	String getName()
     {
    	 return name;
     }
     int getId()
     {
    	 return id;
     }
     void display()
     {
    	 System.out.println(id+" "+name);
     }
	}

	


