package com.epam.myelizaryeu.task1.appliances;

public class Lamp extends SmallAppliance {

    private int brightness;

    public Lamp() {
        this.setName("Lamp");
    }

    @Override
    public PowerSource getPowerSource() {
        return PowerSource.BATTERY;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            throw new IllegalArgumentException("Wrong brightness: " + brightness);
        }
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                ", brightness=" + brightness +
                ", sourcePower=" + getPowerSource() +
                '}';
    }
}
