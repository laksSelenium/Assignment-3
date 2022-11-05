package assignment_3;
/*
 * Create a list of numbers 33,44,55,66,77,88 and perform below operation
	Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	Convert List into array.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3_Task6 {
	
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		numbers.add(66);
		numbers.add(77);
		numbers.add(88);
		int lastIndex = (numbers.size() - 1);
		int secondLastIndex = (lastIndex - 1);

		System.out.println("secondLastIndex is " + secondLastIndex);
		numbers.remove(secondLastIndex);

		// Remove using index
		System.out.println("ArrayList after removing second element from list using index " + numbers);

		numbers.add(4, 77);
		// Remove using value
		numbers.remove(numbers.get(secondLastIndex));
		System.out.println("ArrayList after removing second element from list using value " + numbers);

		// adding 90 to index 3
		numbers.add(3, 90);
		System.out.println("Value in index 3 is " + numbers.get(3));
		System.out.println("ArrayList after adding 90 in index 3 " + numbers);

		// Get the length of the list
		System.out.println("Length of the arryList is " + numbers.size());

		// Print all values of list
		for (int counter = 0; counter < numbers.size(); counter++) {
			System.out.println(numbers.get(counter));
		}

		// convert list to array
		Object[] listToArray = numbers.toArray();
		System.out.println("List converted to array and its objects are : ");
		for (Object arrayObj : listToArray) {
			System.out.println(arrayObj);

		}

	}

}
