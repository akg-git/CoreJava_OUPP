/**
 * 
 */
package gov.in.oupp.training.java.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Asish Kumar Gouda
 *
 */

class Student implements Comparable {
	int id;
	String name;
	float marks;

	Student() {
	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class ComparableDemoClass {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(12, "Fahim", 55));
		studentList.add(new Student(3, "Rohan", 98));
		studentList.add(new Student(5, "Farookh", 13));
		studentList.add(new Student(2, "Arun", 83));
		studentList.add(new Student(13, "Gurpreet", 23));

		System.out.println(studentList);

		// forEach shortcuts
		studentList.forEach(System.out::println);
		Collections.sort(studentList);
		studentList.forEach(System.out::println);

	}

}
