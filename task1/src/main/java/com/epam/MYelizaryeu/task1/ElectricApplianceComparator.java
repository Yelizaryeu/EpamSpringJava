package com.epam.myelizaryeu.task1;

import com.epam.myelizaryeu.task1.appliances.ElectricAppliance;

import java.util.Comparator;

public class ElectricApplianceComparator implements Comparator<ElectricAppliance> {

    @Override
    public int compare(ElectricAppliance ea1, ElectricAppliance ea2) {
        return Integer.compare(ea1.getPower(), ea2.getPower());
    }
}
