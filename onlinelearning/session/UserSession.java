package com.onlinelearning.session;

public class UserSession {
	private static UserSession instance;
	private String currentUser;

	private UserSession() {
	};

	public static UserSession getInstance() {
		if (instance == null)
			instance = new UserSession();
		return instance;
	}

	public void login(String username) {
		this.currentUser = username;
		System.out.println("User Logged in: " + username);
	}

	public void logout() {
		System.out.println("User logged out: " + currentUser);
	}

	public String getCurrentUser() {
		return currentUser;
	}
}
