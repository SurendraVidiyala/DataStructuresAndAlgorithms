package Linkedlists;

public class Person implements Comparable<Person> {
	
	/**
	 * Created by surendra_vidiyala on 02/05/18.
	 */

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.age, person.getAge());
	}

}
