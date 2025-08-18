package com.onlinelearning.course;

public class LiveCourse implements Course {
	private String title;
	private double duration;

	public LiveCourse(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "LiveCourse [title=" + title + ", duration=" + duration + "]";
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getType() {
		return "Live";
	}

	@Override
	public double getDuration() {
		return duration;
	}

}
