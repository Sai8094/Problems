package com.onlinelearning.course;

public class CourseFactory {

	public static Course createCourse(String type, String title, double hours) {
		switch (type.toLowerCase()) {
		case "live":
			return new LiveCourse(title, hours);
		case "video":
			return new VideoCourse(title, hours);
		default:
			System.out.println("Invalid Type");
		}
		return null;
	}
}
