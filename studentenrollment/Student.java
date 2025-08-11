package com.studentenrollment;

public class Student {
	int studentId;
	String studentName;
	Course course;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	void enrollToCourse(Course course) {
		if (course instanceof Maths) {
			course.enroll();
			course.getFacultyDetails();
			course.viewContent();
			System.out.println();
		} else if (course instanceof Physics) {
			course.enroll();
			course.getFacultyDetails();
			course.viewContent();
			System.out.println();
		} else if (course instanceof History) {
			course.enroll();
			course.getFacultyDetails();
			course.viewContent();
			System.out.println();
		}
	}

	void updateAttendence(Course course, double attendence) {
		if (course instanceof Maths) {
			((Maths) course).setAttendence(attendence);

		} else if (course instanceof Physics) {
			((Physics) course).setAttendence(attendence);
		} else if (course instanceof History) {
			((History) course).setAttendence(attendence);
		}
	}

	void updateGrade(Course course, String grade) {
		if (course instanceof Maths) {
			((Maths) course).setGrade(grade);
		} else if (course instanceof Physics) {
			((Physics) course).setGrade(grade);
		} else if (course instanceof History) {
			((History) course).setGrade(grade);
		}
	}

	void getAttendenceDetails(Course course) {
		if (course instanceof Maths) {
			System.out.println("Maths Attendence : " + ((Maths) course).getAttendence() + "%");
		} else if (course instanceof Physics) {
			System.out.println("Physics Attendence : " + ((Physics) course).getAttendence() + "%");
		} else if (course instanceof History) {
			System.out.println("History Attendence : " + ((History) course).getAttendence() + "%");
		}
	}

	void getGrade(Course course) {
		if (course instanceof Maths) {
			System.out.println("Maths Grade: " + ((Maths) course).getGrade());
		} else if (course instanceof Physics) {
			System.out.println("Physics Grade: " + ((Physics) course).getGrade());
		} else if (course instanceof History) {
			System.out.println("History Grade: " + ((History) course).getGrade());
		}
	}
}
