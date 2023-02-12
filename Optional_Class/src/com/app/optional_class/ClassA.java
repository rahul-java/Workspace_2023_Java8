package com.app.optional_class;

import java.util.Optional;

public class ClassA {

	void meth1()
	{
		String arr[]=new String[5];
		
		arr[1]="Rahul";
		arr[2]="Java";
		
		//System.out.println(arr[0].toUpperCase()); //Null pointer exception occure
		
		System.out.println("------------------Optional Class implementation--------------");
		Optional<String> op = Optional.ofNullable(arr[2]);
		System.out.println(op);
		
		if(op.isPresent())
		{
			System.out.println("Data is Present.");
			System.out.println(op.get().toUpperCase());
		}
		else {
			System.out.println("It is empty...");
		}
		
		
		
	}
	public static void main(String[] args) {
		
		new ClassA().meth1();

	}

}
