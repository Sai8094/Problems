package com.onlinelearning.learningpath;

import java.util.ArrayList;
import java.util.List;

import com.onlinelearning.course.Course;

public class LearningPath {
	private String name;
	private List<Course> courses;
	private String description;

	private LearningPath(Builder b) {
		this.name = b.name;
		this.courses = new ArrayList<>(b.courses);
		this.description = b.description;
	}

	public static class Builder {
		private String name;
		private List<Course> courses = new ArrayList<>();
		private String description = "";

		public Builder(String name) {
			this.name = name;
		}

		public Builder addCourse(Course c) {
			courses.add(c);
			return this;
		}

		public Builder description(String desc) {
			this.description = desc;
			return this;
		}

		public LearningPath bulid() {
			return new LearningPath(this);
		}
	}
	@Override
	public String toString() {
		return "LearningPath [name=" + name + ", courses=" + courses + ", description=" + description + "]";
	}
}
