package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//manage the universities students, professor, courses.


public class UniversityManagement {
	
	private static final Course[] courses = null;
	private List<Student> students;//list to hold Students
	private List<Professor>professors;//list to hold professors
	private List<Course> Courses;// list to hold courses
	
	//constructor to intialize empty lists for Students,Professors, Courses.
	public UniversityManagement() {
	students = new ArrayList<>();
	professors = new ArrayList<>();
	Courses = new ArrayList<>();
	}
	//method to add a student
	public void addStudent(String name) {
		students.add(new Student(name));
	}
	
	//method to add  professor
	public void addProfessors(String name) {
		professors.add(new Professor(name));
	}

	//method to add  course
		public void addCourse(String title) {
			Courses.add(new Course(title));
		}

	//method to enroll a student in course
		public void enrollStudentInCourse(String studentName, String courseTitle) {
			Student student = findStudentByName(studentName);//find the student by name.
				Course course = findCourseByTitle(courseTitle);//find the course by title.
				
				if(student!=null&&course!=null) {
					student.enrollInCourse(course);
				}else {
					System.out.println("Student or Course Not Found ");//error message if not found
				}
		}
		//method to assign course in the professor.
		public void assignCourseToProfessor(String professorName,String courseTitle){
			Course course = findCourseByTitle(courseTitle);// find the course by tite.
			Professor  Professor = findProfessorByName(professorName);//find the professor by name.
			if(Professor !=null && course != null){
				Professor.assignCourse(course);//assign the course to the professor.
			}else {
				System.out.println("Professor or Course Not Found ");
			}
		}
		//method to list all Students.
		public void listStudents() {
			System.out.println("List of Students in University :");
			for(Student student: students){
				System.out.println(student);//print each students name.
			}
		}

		//method to add professrs
		public void listProfessors() {
			System.out.println("List of PRofessors in University:");
			for(Professor professor:professors){
				System.out.println(professor);
				
			}
		}
		
		//method to list of all courses
				public void listCourses() {
					System.out.println("List of Courses in University:");
					for(Course course:courses){
						System.out.println(course);
						
					}
				}
				
				
				//method to display the courses is enrolled in.
				
				public void displayStudentCourses(String studentName) {
					Student student = findStudentByName(studentName);//find the student by name.
					if(student!=null){
						System.out.println("Course for Student " +studentName +": ");
						for(Course course: student.getEnrolledCourses()) {
							System.out.println(course);//
						}
						
					}else {
						System.out.println("Student Not Found ");//error message if student not found
					}
				}
				
				//method to display the code assigned to a professor.
				public void displayProfessorCourses(String professiorName) {
					Professor professor =  findProfessorByName(professorName);//find the professor by the name.
					if(professor!=null) {
						System.out.println("Course assigned to a Professor  : " +professorName+  " : ");
						for(Course course:professor.getAssignedCourses()){
							System.out.println("professor not found :");
							
						}
								
					}
					
					
				}
				
			//helper method to find a student by name.
				private Student findStudentByName(String name) {
					for(Student student:students) {
							if(student.getName().equals(name)){
								return student;//return student if found.
							}
						}
					return null;//return null if student not found.
				}
				//helper method to find professor by  name.
				private Professor findProfessorByName(String name) {
					for(Professor professor:professors) {
							if(professor.getName().equals(name)){
								return professor;//return professor if found.
							}
						}
					return null;//return null if professor not found.
				}
				//helper method to find a course by  title.
				private Course findCourseByTitle(String title) {
					for(Course course:courses) {
							if(course.getTitle().equals(title)){
								return course;//return course if found.
							}
						}
					return null;//return null if course not found.
				}
				//Main method to interact with the system through a menu		
				
	public static void main(String[] args) {
		UniversityManagement management = new UniversityManagement();
		Scanner scanner = new Scanner(System.in);//scanner for user input.
		boolean running = true;//flag to control while loop.
		while(running){
			System.out.println("\nUniversityManagement");
			System.out.println("1. Add Student");
			System.out.println("2. Add Professor");
			System.out.println("3. Add Course");
			System.out.println("4.Enroll Student in Course");
			System.out.println("5. Assign Course to Professor");
			System.out.println("6. List of Students");
			System.out.println("7. List of Professors");
			System.out.println("8. List of Courses");
			System.out.println("9. Display Student Courses");
			System.out.println("10. Display Professor Courses");
			System.out.println("11. Exit");
			System.out.println("Enter Your Option");
			int option = scanner.nextInt();
			scanner.nextLine();//consume the new line character.
			
			//switch case to handle user choice.
			switch(option) {
			case 1 :
				System.out.print("Enter Student Name :");
			String studentName = scanner.nextLine();
			management.addCourse(studentName);
			break;
			case 2 :
				System.out.print("Enter professor Name :");
				String professorName = scanner.nextLine();
				management.addCourse(professorName);
				break;
			case 3 :
				System.out.print("Enter Course Title :");
				String courseTitle = scanner.nextLine();
				management.addCourse(courseTitle);
				break;
			case 4 :
				System.out.print("Enter Student Name :");
				String enrollStudent = scanner.nextLine();
				System.out.print("Enter Course Title :");
				String enrollCourse = scanner.nextLine();
				management.enrollStudentInCourse(enrollStudent, enrollCourse);
				break;
			case 5 :
				System.out.print("Enter Professor Name :");
				String assignProfessor = scanner.nextLine();
				System.out.print("Enter Course Title :");
				String assignCourse = scanner.nextLine();
				management.assignCourseToProfessor(assignProfessor, assignCourse);
				break;
				
			case 6:
				management.listStudents();
				break;
			case 7 :
				management.listProfessors();
				break;
			case 8 :
				management.listCourses();
				break;
			case 9 :
				System.out.print("Enter Student Name :");
				String displayStudent= scanner.nextLine();
				management.displayStudentCourses(displayStudent);
				break;
			case 10 :
				System.out.print("Enter Professor Name :");
				String displayProfessor= scanner.nextLine();
				management.displayProfessorCourses(displayProfessor);
				break;
			case 11 :
				running = false;//exit the loop.
				System.out.println("Exisisting");
				break;
				default:
					System.out.println("Invalid Choice. Please Enter A Number 1 to 11");
					break;
			}
			
		}
				
				
        scanner.close(); // Close the scanner
				
			}
			
}
