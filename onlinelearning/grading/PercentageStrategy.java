package com.onlinelearning.grading;

public class PercentageStrategy implements GradingStrategy {

	@Override
	public String grade(double score) {
		return String.format("%.1f%%", score);
	}

}
