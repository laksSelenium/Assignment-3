package assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3_Task2 {
//Task-2 Write a program which can store List of Integer values and print all the values using forEach

	public static void main(String[] args) {
		System.out.println("The values in the list are : ");
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
	}

}
