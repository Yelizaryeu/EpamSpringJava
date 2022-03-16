
package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import task1.appliances.AlarmClock;
import task1.appliances.Dishwasher;
import task1.appliances.ElectricAppliance;
import task1.appliances.Fridge;
import task1.appliances.Kettle;
import task1.appliances.Lamp;
import task1.appliances.Microwave;
import task1.appliances.MicrowaveMode;

public class Main {

	public static void main(String[] args) {
		ArrayList<ElectricAppliance> appliances = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Microwave microwave = new Microwave();
		microwave.setId(1);
		microwave.setSwitchedOn(true);
		microwave.setPower(1500);
		microwave.setMode(MicrowaveMode.DEFROST);
		appliances.add(microwave);

		Kettle kettle = new Kettle(2.5, true);
		kettle.setId(2);
		kettle.setPower(1200);
		kettle.setSwitchedOn(false);
		kettle.turnOn();
		appliances.add(kettle);

		Dishwasher dishwasher = new Dishwasher();
		dishwasher.setId(3);
		dishwasher.setPower(3500);
		dishwasher.setOperationVolume(2.2);
		dishwasher.setSwitchedOn(false);
		appliances.add(dishwasher);

		AlarmClock alarmclock = new AlarmClock("Black");
		alarmclock.setId(4);
		alarmclock.setPower(5);
		alarmclock.setSwitchedOn(true);
		alarmclock.turnOff();
		appliances.add(alarmclock);

		Fridge fridge = new Fridge(true);
		fridge.setId(5);
		fridge.setPower(200);
		fridge.setSwitchedOn(true);
		appliances.add(fridge);

		Lamp lamp = new Lamp();
		lamp.setId(6);
		lamp.setPower(60);
		lamp.setSwitchedOn(false);
		lamp.turnOn();
		appliances.add(lamp);

		for (ElectricAppliance appliance : appliances) {
			System.out.println(appliance);
		}
		System.out.println("Calculated power usage: " + (CalculateUsage.calculatePowerUsage(appliances)) + " Watt");
		Collections.sort(appliances, new ElectricApplianceComparator());
		for (ElectricAppliance appliance : appliances) {
			System.out.println(appliance);
		}
		System.out.println("Enter search range (from min to max)");
		double minPower = scanner.nextDouble();
		double maxPower = scanner.nextDouble();
		scanner.close();
		for (ElectricAppliance appliance : Filter.filterByPower(appliances, minPower, maxPower)) {
			System.out.println(appliance);
		}
	}

}
