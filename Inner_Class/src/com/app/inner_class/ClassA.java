package com.app.inner_class;

public class ClassA {
	
	private void meth1()
	{
		System.out.println("Outer class method is called...");
	}
	
	void meth2()
	{
		System.out.println("Java is awesome...");
	}

	class InnerClass
	{
	   	void show()
		{
			System.out.println("Inner class method show() is called...");
			meth1();
		}
		
		public InnerClass() {
			System.out.println("Inner CLass Constructor is called.");
			meth2();
		}
	}
	
	public ClassA() {
		System.out.println("Outer class constructor.");
	}
	
	static
	{
		System.out.println("Outer class static block is executed...");
	}
	public static void main(String[] args) {
		
		ClassA.InnerClass innerClassObj = new ClassA().new InnerClass();
		innerClassObj.show();

	}

}
