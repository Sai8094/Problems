package com.smarthome.device.factory;

import com.smarthome.device.Device;

public interface Factory {
	Device createLight();

	Device createSecurityCamera();
}
