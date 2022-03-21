package task1;

import task1.appliances.ElectricAppliance;

import java.util.List;

public class Calculator {

    public static int calculatePower(List<ElectricAppliance> appliances) {
        int result = 0;
        for (ElectricAppliance appliance : appliances) {
            if (appliance.isSwitchedOn()) {
                result += appliance.getPower();
            }
        }
        return result;
    }
}
