package Linkedlists;

public class App {

	public static void main(String[] args) {
		
		/**
		 * Created by surendra_vidiyala on 02/05/18.
		 */

		List<Integer> myLinkedList = new LinkedList<>();

		myLinkedList.insert(1);
		myLinkedList.insert(2);
		myLinkedList.insert(3);
		myLinkedList.insert(4);

		myLinkedList.remove(1);

		myLinkedList.traverseList();

		System.out.println("----------Person-----------");

		Person p = new Person("Micheal", 14);

		List<Person> list = new LinkedList<>();
		list.insert(new Person("Adam", 10));
		list.insert(new Person("Jackson", 8));
		list.insert(new Person("Bob", 4));
		list.insert(new Person("Nichole", 6));
		list.insert(new Person("Micheal", 14));

		System.out.println(list.size());

		list.remove(p);

		list.traverseList();

	}
}
