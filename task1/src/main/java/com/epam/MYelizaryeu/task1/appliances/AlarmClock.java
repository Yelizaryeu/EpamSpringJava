package com.epam.myelizaryeu.task1.appliances;

public class AlarmClock extends SmallAppliance {

    private final String color;

    public AlarmClock(String color) {
        this.setName("Alarm clock");
        this.color = color;
    }

    @Override
    public PowerSource getPowerSource() {
        return PowerSource.BATTERY;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                "color='" + color + '\'' +
                ", sourcePower=" + getPowerSource() +
                '}';
    }
}
