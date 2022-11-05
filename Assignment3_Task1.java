package assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3_Task1 {
//Task-1 Write a program which can store List of Integer values and print all the values using for loop.

	public static void main(String[] args) {
		System.out.println("The values in the list are : ");
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		for(int counter=0;counter<numbers.size();counter++) {
			System.out.println(numbers.get(counter));
		}
		
		
	}

}
