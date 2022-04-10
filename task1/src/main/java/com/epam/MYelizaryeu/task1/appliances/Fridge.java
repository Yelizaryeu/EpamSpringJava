package com.epam.myelizaryeu.task1.appliances;

public class Fridge extends MajorAppliance {

    private final boolean hasFreezer;

    public Fridge(boolean hasFreezer) {
        this.setName("Fridge");
        this.hasFreezer = hasFreezer;
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                ", hasFreezer=" + hasFreezer +
                ", sourcePower=" + getPowerSource() +
                '}';
    }
}
