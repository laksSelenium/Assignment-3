package assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3_Task4 {
//Task-4 Write a program which will print sum of all numbers which is stored in list.

	public static void main(String[] args) {
		int sum = 0;

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		for (int counter = 0; counter < numbers.size(); counter++) {
			sum = sum + numbers.get(counter);

		}
		System.out.println("Sum of the numbers in the list is " + sum);

	}

}
