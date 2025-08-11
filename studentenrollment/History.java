package com.studentenrollment;

public class History implements Course {

	String facultyName = "Prof.Hemanth";
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
		System.out.println("Student enrolled to History Course");
	}

	@Override
	public void viewContent() {
		System.out.println("Contenets: India History, India Geography, India Economics");
	}

	@Override
	public void getFacultyDetails() {
		System.out.println("Course Handled by " + this.facultyName);
	}

}
