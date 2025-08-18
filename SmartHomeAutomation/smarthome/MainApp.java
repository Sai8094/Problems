package com.smarthome;

import com.smarthome.controller.SmartHomeController;
import com.smarthome.device.Device;
import com.smarthome.device.factory.*;
import com.smarthome.energy.BalancedSaving;
import com.smarthome.energy.EnergySavingStrategy;
import com.smarthome.scene.*;

public class MainApp {

	public static void main(String[] args) {

		SmartHomeController controller = SmartHomeController.getInstance();
		controller.sendCommad("System start");

		Factory factory = new PhilipsFactory();
		Device light = factory.createLight();
		Device camera = factory.createSecurityCamera();

		Scene morning = new SceneBuilder().addDevice(light).addDevice(camera).bulid();

		morning.setScene("Morning");

		EnergySavingStrategy strategy = new BalancedSaving();
		strategy.apply();

	}
}
