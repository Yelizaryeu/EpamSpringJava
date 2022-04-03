package com.epam.MYelizaryeu.task1;

import com.epam.MYelizaryeu.task1.appliances.ElectricAppliance;

import java.util.Comparator;

public class ElectricApplianceComparator implements Comparator<ElectricAppliance> {

    public int compare(ElectricAppliance ea1, ElectricAppliance ea2) {
        return Integer.compare(ea1.getPower(), ea2.getPower());
    }
}
