package com.studentenrollment;

public class StudentEnrollment {

	public static void main(String[] args) {
		Course course1 = new Maths();
		Course course2 = new Physics();
		Course course3 = new History();

		Student student1 = new Student(101, "Saigopi");

		student1.enrollToCourse(course1);
		student1.enrollToCourse(course2);
		student1.enrollToCourse(course3);

		student1.updateAttendence(course1, 50);
		student1.updateAttendence(course2, 70);
		student1.updateAttendence(course3, 89);

		student1.updateGrade(course1, "B");
		student1.updateGrade(course2, "A");
		student1.updateGrade(course3, "A");

		student1.getAttendenceDetails(course1);
		student1.getGrade(course1);

		student1.getAttendenceDetails(course2);
		student1.getGrade(course2);

		student1.getAttendenceDetails(course3);
		student1.getGrade(course3);

	}

}
