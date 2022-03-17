
package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		
		List<ElectricAppliance> appliances = new ArrayList<>();

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

		System.out.println("Available appliances:");
		for (ElectricAppliance appliance : appliances) {
			System.out.println(appliance);
		}
		System.out.printf("Calculated power usage: %d Watt%n",(CalculateUsage.calculatePowerUsage(appliances)));
		Collections.sort(appliances, new ElectricApplianceComparator());
		
		System.out.println("Appliances sorted by power:");
		for (ElectricAppliance appliance : appliances) {
			System.out.println(appliance);
		}
		
		System.out.println("Enter search power range (from minimum to maximum)");
		Scanner scanner = new Scanner(System.in);
		double minPower = scanner.nextDouble();
		double maxPower = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Appliances in specified power range:");
		for (ElectricAppliance appliance : Filter.filterByPower(appliances, minPower, maxPower)) {
			System.out.println(appliance);
		}
	}
}
