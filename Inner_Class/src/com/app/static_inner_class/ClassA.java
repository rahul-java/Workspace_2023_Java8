package com.app.static_inner_class;

public class ClassA {

	 int a=10; //instance
	static int b=20;  //static
	
	ClassA(){
		System.out.println("Outer Class Constructor called.");
	}
	
	static
	{
		System.out.println("Outer class static block is executed...");
	}
	
	void meth1()
	{
		System.out.println("----------meth1()------------");
		System.out.println("Instance variable : "+a);
		System.out.println("Static variable : "+b);
	}
	
	static void meth2()
	{
		System.out.println("----------meth2()------------");
		//System.out.println("Instance variable : "+a); //we can not access directly instance variable inside static method.
		System.out.println("Static variable : "+b);
		System.out.println("Instance variable : "+new ClassA().a); 
	}
	
	static class InnerClassA
	{
		void show()
		{
			System.out.println("show() method called...");
			System.out.println("Instance variable : "+new ClassA().a);
			System.out.println("Static variable : "+b);
		}
		
		public InnerClassA() 
		{
			System.out.println("Inner Class Constructor called.");
		}
		
		static
		{
			System.out.println("Inner CLass Static block");
		}
		
		public static void main(String[] args) {
			
			System.out.println("Inner Class Main() Method executed.....");
			new InnerClassA().show();

		}
	}
	public static void main(String[] args) {
		
		System.out.println("Outer Class Main() Method executed.....");
		ClassA.InnerClassA iobj = new ClassA.InnerClassA();
		iobj.show();

	}

}
/*
Outer Class Main() Method executed.....
Inner CLass Static block
Inner Class Constructor called.
show() method called...
Outer Class Constructor called.
Instance variable : 10
Static variable : 20
 
  *
Inner CLass Static block
Inner Class Main() Method executed.....
Inner Class Constructor called.
show() method called...
Outer class static block is executed...
Outer Class Constructor called.
Instance variable : 10
Static variable : 20
  *
  *
  */
