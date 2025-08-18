package com.onlinelearning.course.factory;

import com.onlinelearning.course.Course;
import com.onlinelearning.course.LiveCourse;
import com.onlinelearning.course.VideoCourse;

public class ArtsFactory implements SubjectFactory {

	@Override
	public Course mainCourse() {
		return new VideoCourse("Physics Fundamentals", 4.5);
	}

	@Override
	public Course electiveCourse() {
		return new LiveCourse("Karnataka History", 3.0);
	}

}
