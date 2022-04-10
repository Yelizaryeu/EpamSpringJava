package com.epam.myelizaryeu.task1.appliances;

public class Dishwasher extends MajorAppliance {

    private final double operationVolume;

    public Dishwasher(double operationVolume) {
        this.setName("Dishwasher");
        this.operationVolume = operationVolume;
    }

    public double getOperationVolume() {
        return operationVolume;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                " name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                "operationVolume=" + operationVolume +
                ", sourcePower=" + getPowerSource() +
                '}';
    }
}
