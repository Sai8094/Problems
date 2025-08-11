package com.studentenrollment;

public class Maths implements Course {
	String facultyName = "Prof.Ramesh";
	private String grade;
	private double attendence;

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getAttendence() {
		return attendence;
	}

	public void setAttendence(double attendence) {
		this.attendence = attendence;
	}

	@Override
	public void enroll() {
		System.out.println("Student enrolled to Maths Course");
	}

	@Override
	public void viewContent() {
		System.out.println("Contents: Sets and Realations,Algebra, Geometry,Statistics,Probability");
	}

	@Override
	public void getFacultyDetails() {
		System.out.println("Course Handled by " + this.facultyName);
	}

}
