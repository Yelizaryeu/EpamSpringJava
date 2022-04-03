package com.epam.MYelizaryeu.task1.appliances;

abstract class MajorAppliance extends ElectricAppliance {

    public MajorAppliance() {
        super("Major");
    }

    @Override
    public PowerSource getPowerSource() {
        return PowerSource.PLUG;
    }
}
