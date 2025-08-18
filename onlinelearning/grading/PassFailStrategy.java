package com.onlinelearning.grading;

public class PassFailStrategy implements GradingStrategy {

	@Override
	public String grade(double score) {
		return score >= 50 ? "Pass" : "Fail";
	}

}
