package com.app;

public class ClassA {

	void meth1()
	{
		System.out.println("Implementing Enum");
		Days d = Days.thursday;
		System.out.println(d);
		
		switch(d)
		{
		case thursday: System.out.println("Today is last day.");
		                break;
		}
		System.out.println("----------------------");
		
		Days[] days = Days.values();
		for(Days s:days)
			System.out.println(s);
		
	}
	
	
	public static void main(String[] args) {
		new ClassA().meth1();
	}
}
