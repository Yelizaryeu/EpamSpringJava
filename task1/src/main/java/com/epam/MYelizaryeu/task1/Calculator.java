package com.epam.MYelizaryeu.task1;

import com.epam.MYelizaryeu.task1.appliances.ElectricAppliance;
import java.util.List;

public class Calculator {

    private Calculator(){};

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
