package Lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	
	/**
	 * Created by surendra_vidiyala on 02/05/18.
	 */
	
	/**
	 *  It is another implementation of the List interface
	 *       -implements List, Queue, Dequeue interfaces + ....
	 *       
	 *  It uses references --> each item has a reference to the next item + store the
	 *      data itself.
	 *      
	 *      34 -> 100 -> -12 -> 1 Single Linked List
	 *      34 <-> 100 <-> -12 <-> 1 Doubly Linked List
	 *      
	 *      - NO RANDOM ACCESS !!!
	 *      - not synchronized
	 *      - we can remove items very efficiently / o(1) when removing from the beginning / end
	 *      - no sequential access !!! if we want to  find an item  we have to iterate through the 
	 *             list until we find it / o(N)
	 *      - remove operation is very efficient: just update the references/ pointers o(1)
	 *      - so we should use a LinkedList for remove-heavy applications !!!
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(14);
		list.add(16);
		list.add(15);
		list.add(9);
		
		System.out.println(list.get(3));// Not that fast
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.remove(0);
		
		for(Integer l:list) {
			System.out.println(l);
		}

		System.out.println(list); // looks like an array
		
	}

}
