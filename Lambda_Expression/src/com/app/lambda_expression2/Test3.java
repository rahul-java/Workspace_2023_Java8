package com.app.lambda_expression2;

public class Test3 {

	public void testMethod()
	{
		InterfaceA x=(int age)->
		                {
			               if(age>=18)
			            	   System.out.println("Congratulations You are eligible to VOTE......");
			               else
			            	   System.out.println("SORRY ! You are not eligible to VOTE.");
		                 };
		x.checkAge(17);
	}
	public static void main(String[] args) {
		new Test3().testMethod();
	}

}
