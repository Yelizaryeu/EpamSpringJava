package com.epam.MYelizaryeu.task1;

import com.epam.MYelizaryeu.task1.appliances.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceApplication {

    public static void main(String[] args) {
        List<ElectricAppliance> appliances = new ArrayList<>();

        ElectricAppliance microwave = new Microwave(22.5);
        microwave.setId(1);
        microwave.setSwitchedOn(true);
        microwave.setPower(1500);
        appliances.add(microwave);

        ElectricAppliance kettle = new Kettle(2.5, true);
        kettle.setId(2);
        kettle.setPower(1200);
        kettle.setSwitchedOn(false);
        kettle.turnOn();
        appliances.add(kettle);

        ElectricAppliance dishwasher = new Dishwasher(2.2);
        dishwasher.setId(3);
        dishwasher.setPower(3500);
        dishwasher.setSwitchedOn(false);
        appliances.add(dishwasher);

        ElectricAppliance alarmClock = new AlarmClock("Black");
        alarmClock.setId(4);
        alarmClock.setPower(5);
        alarmClock.setSwitchedOn(true);
        alarmClock.turnOff();
        appliances.add(alarmClock);

        ElectricAppliance fridge = new Fridge(true);
        fridge.setId(5);
        fridge.setPower(200);
        fridge.setSwitchedOn(true);
        appliances.add(fridge);

        ElectricAppliance lamp = new Lamp();
        lamp.setId(6);
        lamp.setPower(60);
        lamp.setSwitchedOn(false);
        lamp.turnOn();
        appliances.add(lamp);

        System.out.println("Available appliances:");
        for (ElectricAppliance appliance : appliances) {
            System.out.println(appliance);
        }

        System.out.printf("Calculated power usage: %d Watt%n", Calculator.calculatePower(appliances));

        appliances.sort(new ElectricApplianceComparator());
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
