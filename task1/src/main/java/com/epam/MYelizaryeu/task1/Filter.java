package com.epam.MYelizaryeu.task1;

import com.epam.MYelizaryeu.task1.appliances.ElectricAppliance;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private Filter(){}

    public static List<ElectricAppliance> filterByPower(List<ElectricAppliance> appliances, double minPower, double maxPower) {
        List<ElectricAppliance> result = new ArrayList<>();
        for (ElectricAppliance appliance : appliances) {
            if (appliance.getPower() >= minPower && appliance.getPower() <= maxPower) {
                result.add(appliance);
            }
        }
        return result;
    }
}
