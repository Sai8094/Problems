package com.smarthome.controller;

public class SmartHomeController {
	private static SmartHomeController instance;

	private SmartHomeController() {
	}

	public static SmartHomeController getInstance() {
		if (instance == null)
			instance = new SmartHomeController();
		return instance;
	}

	public void sendCommad(String cmd) {
		System.out.println("Controller: " + cmd);
	}

}
