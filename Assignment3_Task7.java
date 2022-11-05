package assignment_3;
/*
 * Write a program which will display true if list contains Mobile else prints false
	List  - Web Automation, API Automation, Mobile Automation.
	Output – True


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assignment3_Task7 {

	public static void main(String[] args) {
		int testCounter = 0;

		List<String> automationTools = Arrays.asList("Web Automation", "API Automation", "Mobile Automation");

		for (int counter = 0; counter < automationTools.size(); counter++) {

			String textToVerify = automationTools.get(counter);
			if (textToVerify.contains("Mobile")) {
				System.out.println(true);
				testCounter = 1;
			}
		}
		if (testCounter < 1) {
			System.out.println(false);
		}

		System.out.println(automationTools.contains("Mobile Automation"));

	}

}
