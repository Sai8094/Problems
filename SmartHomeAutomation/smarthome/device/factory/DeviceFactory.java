package com.smarthome.device.factory;

import com.smarthome.device.*;

public class DeviceFactory {
	public static Device createDevice(String type) {
		switch (type.toLowerCase()) {

		case "light":
			return new Light();
		case "camera":
			return new SecurityCamera();
		default:
			System.out.println("Invalid Device Name");
		}
		return null;
	}
}
