package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ElectricAppliances.AlarmClock;
import ElectricAppliances.Dishwasher;
import ElectricAppliances.ElectricAppliance;
import ElectricAppliances.Fridge;
import ElectricAppliances.Kettle;
import ElectricAppliances.Lamp;
import ElectricAppliances.Microwave;
import ElectricAppliances.MicrowaveMode;

public class Main {

	public static void main(String[] args) {
		ArrayList<ElectricAppliance> Appliances = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		CalculateUsage calculate = new CalculateUsage();
		Filter filter = new Filter();

		Microwave microwave = new Microwave();
		microwave.setId(1);
		microwave.setSwitchedOn(true);
		microwave.setPower(1500);
		microwave.setMode(MicrowaveMode.DEFROST);
		Appliances.add(microwave);

		Kettle kettle = new Kettle(2.5, true);
		kettle.setId(2);
		kettle.setPower(1200);
		kettle.setSwitchedOn(false);
		kettle.turnOn();
		Appliances.add(kettle);

		Dishwasher dishwasher = new Dishwasher();
		dishwasher.setId(3);
		dishwasher.setPower(3500);
		dishwasher.setOperationVolume(2.2);
		dishwasher.setSwitchedOn(false);
		Appliances.add(dishwasher);

		AlarmClock alarmclock = new AlarmClock("Black");
		alarmclock.setId(4);
		alarmclock.setPower(5);
		alarmclock.setSwitchedOn(true);
		alarmclock.turnOff();
		Appliances.add(alarmclock);

		Fridge fridge = new Fridge(true);
		fridge.setId(5);
		fridge.setPower(200);
		fridge.setSwitchedOn(true);
		Appliances.add(fridge);

		Lamp lamp = new Lamp();
		lamp.setId(6);
		lamp.setPower(60);
		lamp.setSwitchedOn(false);
		lamp.turnOn();
		Appliances.add(lamp);

		System.out.println(Appliances);
		System.out.println("Calculated power usage: " + (calculate.CalculateUsageOfPower(Appliances)) + " Watt");
		Collections.sort(Appliances, new ElectricApplianceComparator());
		System.out.println(Appliances);
		System.out.println("Enter search range (from a to b)");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		scanner.close();
		System.out.println("Result: \n" + filter.FilterByPower(Appliances, a, b));

	}

}
