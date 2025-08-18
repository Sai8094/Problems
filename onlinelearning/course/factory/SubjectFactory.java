package com.onlinelearning.course.factory;

import com.onlinelearning.course.Course;

public interface SubjectFactory {
	Course mainCourse();
	Course electiveCourse();
}
