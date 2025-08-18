package com.onlinelearning.course.factory;

import com.onlinelearning.course.Course;
import com.onlinelearning.course.LiveCourse;
import com.onlinelearning.course.VideoCourse;

public class ScienceFactory implements SubjectFactory {

	@Override
	public Course mainCourse() {
		return new VideoCourse("Organic Chemistry", 5.0);
	}

	@Override
	public Course electiveCourse() {
		return new LiveCourse("Geography", 3.0);
	}

}
