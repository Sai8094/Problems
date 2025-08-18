package com.onlinelearning;

import java.awt.GradientPaint;

import com.onlinelearning.course.Course;
import com.onlinelearning.course.CourseFactory;
import com.onlinelearning.course.factory.ScienceFactory;
import com.onlinelearning.course.factory.SubjectFactory;
import com.onlinelearning.grading.GradingStrategy;
import com.onlinelearning.grading.PassFailStrategy;
import com.onlinelearning.grading.PercentageStrategy;
import com.onlinelearning.learningpath.LearningPath;
import com.onlinelearning.notify.StudentNotifier;
import com.onlinelearning.session.UserSession;

public class MainApp {

	public static void main(String[] args) {

		UserSession session = UserSession.getInstance();
		session.login("saigopi@gmail.com");

		Course v1 = CourseFactory.createCourse("video", "Intro to Java", 5.0);
		SubjectFactory science = new ScienceFactory();
		Course main = science.mainCourse();
		Course elective = science.electiveCourse();

		LearningPath path = new LearningPath.Builder("Computer Science Starter").addCourse(v1).addCourse(main)
				.addCourse(elective).description("A short path to begin").bulid();

		System.out.println(path);

		StudentNotifier studentNotifier1 = new StudentNotifier("Saigopi");
		studentNotifier1.update("New Assignment posted");

		double score = 84.6;
		GradingStrategy percentage = new PercentageStrategy();
		GradingStrategy pass = new PassFailStrategy();

		System.out.println("Score (percentage) " + percentage.grade(score));
		System.out.println("Score (Pass/Fail): " + pass.grade(score));

		session.logout();

	}

}
