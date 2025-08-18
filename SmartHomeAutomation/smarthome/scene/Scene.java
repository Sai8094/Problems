package com.smarthome.scene;

import java.util.ArrayList;
import java.util.List;

public class Scene {

	List<DeviceObserver> observer = new ArrayList<>();

	public void addObserver(DeviceObserver o) {
		observer.add(o);
	}

	public void setScene(String name) {
		System.out.println("Scene: " + name);
		observer.forEach(o -> o.update(name));
	}
}
