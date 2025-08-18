package com.onlinelearning.course;

public class VideoCourse implements Course {

	@Override
	public String toString() {
		return "VideoCourse [title=" + title + ", duration=" + duration + "]";
	}

	private String title;
	private double duration;

	public VideoCourse(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getType() {
		return "Video";
	}

	@Override
	public double getDuration() {
		return duration;
	}

}
