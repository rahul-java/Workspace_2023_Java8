package com.app.lambda_expression3;

public class Test3 {

	public void testMethod()
	{
		/*
		InterfaceA x=(age)->// no need to define the data type of method argument
		                {
			               if(age>=18)
			            	   System.out.println("Congratulations You are eligible to VOTE......");
			               else
			            	   System.out.println("SORRY ! You are not eligible to VOTE.");
		                 };
		x.show(17);
		*/
		
		/*
		// no need to define round brackets also
		InterfaceA x=age->{
           if(age>=18)
        	   System.out.println("Congratulations You are eligible to VOTE......");
           else
        	   System.out.println("SORRY ! You are not eligible to VOTE.");
         };
       x.show(17);
       
       */
		
		InterfaceA a=(x,y)->System.out.println("Sum is : "+(x+y));
	       a.show(10,20);
		
	}
	
	public static void main(String[] args) {
		new Test3().testMethod();
	}

}
