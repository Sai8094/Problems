package com.smarthome.device.factory;

import com.smarthome.device.Device;
import com.smarthome.device.Light;
import com.smarthome.device.SecurityCamera;

public class PhilipsFactory implements Factory {

	public Device createLight() {
		return new Light();
	}

	public Device createSecurityCamera() {
		return new SecurityCamera();
	}

}
