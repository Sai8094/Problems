package com.smarthome.energy;

public class BalancedSaving implements EnergySavingStrategy {

	@Override
	public void apply() {
		System.out.println("Balanced saving Applied");
	}

}
