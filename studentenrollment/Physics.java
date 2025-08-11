package com.studentenrollment;

public class Physics implements Course {
	String facultyName = "Prof.Mahesh";
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
		System.out.println("Student enrolled to Physics Course");
	}

	@Override
	public void viewContent() {
		System.out.println("Contenets: Physics Fundamentals,Electromagentic Waves, Semiconductors");
	}

	@Override
	public void getFacultyDetails() {
		System.out.println("Course Handled by " + this.facultyName);
	}

}
