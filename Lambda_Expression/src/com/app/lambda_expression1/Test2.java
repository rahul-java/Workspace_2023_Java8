package com.app.lambda_expression1;

public class Test2 {

	public void testMethod()
	{
		InterfaceB y=(int a,int b)->{
			if(a<=100)
			{
				System.out.println("If block is executed...");
				return a+100;
			}
			else {
				System.out.println("else block is executed...");
				return b+100;
			}
		};
		int result = y.meth2(120, 100);
		System.out.println("Lambda expression returns Result : "+result);
		
		System.out.println("=====================================");
		
	InterfaceC z =(int p,int q)->System.out.println("Addition is : "+(p+q));
	z.meth3(100, 200);
	}
	public static void main(String[] args) {
		
		new Test2().testMethod();
	}

}
