package com.smarthome.energy;

public class AggressiveSaving implements EnergySavingStrategy {

	@Override
	public void apply() {
		System.out.println("Aggressive saving Applied");
	}

}
