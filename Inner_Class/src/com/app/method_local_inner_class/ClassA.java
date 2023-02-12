package com.app.method_local_inner_class;

public class ClassA {

	void meth1()
	{
		System.out.println("meth1() is called.");
		String s="Java";
		
		//method local inner class cant be static
		class MethodInnerClassA
		{
			void show()
			{
				String data=" is awesome.";
				System.out.println(s.concat(data));
			}
			public MethodInnerClassA()
			{
				System.out.println("Method Inner Class Constructor Called.");
			}
			
		}
		new MethodInnerClassA().show();
	}
	public static void main(String[] args) {
		
		new ClassA().meth1();

	}

}
