package com.app.method_referencing;

public class ClassB {

	public void show(int age)
	{
		if(age>=18)
     	   System.out.println("Congratulations You are eligible to VOTE......");
        else
     	   System.out.println("SORRY ! You are not eligible to VOTE.");
	}
	
	public static void m1(int y)
	{
		System.out.println("This is static method being called "+y);
	}
	
	public ClassB(int z) {
		System.out.println("Constructor Referencing...."+z);
	}
}
