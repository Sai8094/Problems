package com.onlinelearning.notify;

public class StudentNotifier implements NotificationObserver {
	private String studentName;
	
	public StudentNotifier(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void update(String message)
	{
		System.out.println(studentName +" " + message);
	}
}
