package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	/**
	 * Created by surendra_vidiyala on 02/05/18.
	 */

	/*
	 * This is one of the implementations of the List interface!!. An array stores
	 * the values in the background
	 * 
	 * int[] arr = new int[10]; - random access/ very fast o(1) --> random access:
	 * accessing the items by index ~list.get(0)
	 * 
	 * - it is equivalent to Vector BUT ArrayList is not synchronized. - all
	 * operation run in o(N) time complexity. - but if we want to remove items, this
	 * operation is not so efficient, we have to shift each item in our list - o(N).
	 * 
	 * If our application is just about adding elements to a list and getting
	 * started elements with known indexes -> an arraylist is perfect.
	 * 
	 * Capacity: it is a parameter we can define when we instantiate an ArrayList It
	 * is the Initial size of the Array ~ if we know that we will store 5 million
	 * items in a list we should use it list = new ArrayList(5000000) WHY? This may
	 * reduce the amount of incremental reallocation.
	 * 
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Bob");
		list.add("mary");
		list.add("Kevin");
		list.add("Mathew");
		list.add("Steve");
		list.add(1, "Mary");
		list.add("kevin");

		// getting an element at index(1)
		System.out.println(list.get(1).toUpperCase());
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("*************");
		for (String cond : list) {
			if (cond.equalsIgnoreCase("steve")) {
				System.out.println("Found! " + cond);
			}

		}

		// Checking whether list is empty or not
		boolean empty = list.isEmpty();
		System.out.println(empty);

		// Converting arraylist to array
		Object[] array = list.toArray();
		System.out.println("Array values:");
		// System.out.println(array.toString());
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*************");
		// printing size of the list
		System.out.println("Size of the list is: " + list.size());

		// removing an element at index(3)
		System.out.println("Removed element: " + list.remove(6));

	}

}
