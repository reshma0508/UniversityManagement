package com.codegnan.university.management;

public class Course {
	private String title;//title of the course.
	
	//constructor to initialize the course with title.
	public Course(String title) {
		this.title = title;
	}
	
	//Getting method to retrieve the course title.
public String getTitle() {

	return title;
	
	}
//override tostring method to provide the string represemtation of the course.
public String toString() {
	return title;//return  the course title as the string representation.
}

}
