package assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3_Task5 {
//Task-5 Write a program which will pick the values from Array and Store them List.

	public static void main(String[] args) {
		int sum = 0;
		List<Byte> numbersFromArray = new ArrayList<>();

		byte[] numbers = { 10, 20, 30, 40, 50 };
		for (int counter = 0; counter < numbers.length; counter++) {
			numbersFromArray.add(numbers[counter]);

		}
		System.out.println("List having numbers From Array are" + numbersFromArray);

	}

}
