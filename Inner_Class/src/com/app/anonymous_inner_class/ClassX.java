package com.app.anonymous_inner_class;

public class ClassX {

   static OuterClass out=new OuterClass() {
		
	   @Override
		void print() {
			System.out.println("start");
			super.print();
			System.out.println("I am in anonymous class...");
			System.out.println("End");
		};
	};
	
	public static void main(String[] args) {
		ClassX.out.print();
	}
}
