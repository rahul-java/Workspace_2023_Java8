package com.app.method_referencing;

public class Test3 {

	public void testMethod()
	{
		//:: => is method referencing operator.
		//InterfaceA x=new ClassB()::show;  //NON-Static Method Referencing
		//x.checkAge(37);
		
		//InterfaceA y=ClassB::m1;  // Static Method Referencing
		//y.checkAge(57);
		
		InterfaceA z=ClassB::new;  // Constructor Referencing
		z.checkAge(57);
		
	}
	public static void main(String[] args) {
		new Test3().testMethod();
	}

}
