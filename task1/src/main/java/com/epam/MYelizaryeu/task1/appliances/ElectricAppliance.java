package com.epam.myelizaryeu.task1.appliances;

abstract public class ElectricAppliance {

    private String name;
    private int id;
    private final String type;
    private int power;
    private boolean switchedOn;

    public ElectricAppliance(String type) {
        this.type = type;
    }

    public abstract PowerSource getPowerSource();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    @Override
    public String toString() {
        return "ElectricAppliance{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", power=" + power +
                ", switchedOn=" + switchedOn +
                '}';
    }
}
