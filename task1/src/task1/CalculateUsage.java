package task1;

import task1.appliances.ElectricAppliance;

import java.util.List;

public class CalculateUsage {

    public static int calculatePowerUsage(List<ElectricAppliance> appliances) {
        int result = 0;
        for (ElectricAppliance appliance : appliances) {
            if (appliance.isSwitchedOn()) {
                result += appliance.getPower();
            }
        }
        return result;
    }
}
