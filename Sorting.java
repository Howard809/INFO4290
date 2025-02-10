/*Sorting.java
 *Author: Howard Chen - 100382934
 *Date: February 09, 2025
 *Second branch portion for the Git Exercise - Group - Part 1
*/

import java.util.*;

// Purpose: Five books are going through a single file catalogue system.
// So they went in one after the other. Because the system follows a single file queue, the output comes in reverse order of entry.
// What boook would you see first, second, …, and the last? Choose a
// suitable data structure to simulate the cataloguing, add the five books to the data structure, and then get them out using proper
// operations. You should write a Java method named enterQueue to simulate the data entry process, and a Java
// method named leaveQueue to simulate the process the five books being stacked in reverse order. Then call the two methods in
// the main method to test the two methods;


public class Sorting {
	static Stack<String> queue1 = new Stack<>();
	
	public static void enterQueue() {
		System.out.println("This book went through the catalogue system:");
		System.out.println(queue1.push("Jojo's Bizarre Adventure"));
		System.out.println(queue1.push("The Empire Strikes Back"));
		System.out.println(queue1.push("The Art of War"));
		System.out.println(queue1.push("Guiness Book of Records"));
		System.out.println(queue1.push("Diary of a Wimpy Kid"));
	}
	
	public static void leaveQueue() {
		System.out.println("This book is what's stacked from top to bottom:");
		while (queue1.size() > 0) {
			System.out.println(queue1.pop() + " ");
		}
	}
	
	public static void main () {
		/* Main Method */
		System.out.println("Program written by Howard Chen");
		enterQueue();
		leaveQueue();
	}
}