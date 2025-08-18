package com.smarthome.scene;

import com.smarthome.device.Device;

public class SceneBuilder {
	private final Scene scene = new Scene();

	public SceneBuilder addDevice(Device device) {
		scene.addObserver(s -> {
			if (s.equalsIgnoreCase("Morning"))
				device.on();
			else
				device.off();
		});
		return this;
	}

	public Scene bulid() {
		return scene;
	}
}
