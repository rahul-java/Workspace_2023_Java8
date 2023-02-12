package com.app.parallel_array_sorting;

import java.util.Arrays;

public class ClassB {

	void meth1()
	{
		int arr[]= {2,10,4,6,8,1,9,3,5,7};
		
		System.out.println("---------------------------Before Sorting----------------");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		
		/*
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------After Sorting----------------");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		*/
		
		// by using parallelSort() we can sort middle of the array
		Arrays.parallelSort(arr,1,8);  //this will sort the elements from index 1 to (4-1)index
		System.out.println("---------------------------Sorting the elements in between the array----------------");
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		
		new ClassB().meth1();

	}

}
