package assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assignment3_Task3 {
//Task-3 -Write a program which can store List of Integer values and print all the values using for iterator


	public static void main(String[] args) {
		System.out.println("The values in the list are : ");
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
