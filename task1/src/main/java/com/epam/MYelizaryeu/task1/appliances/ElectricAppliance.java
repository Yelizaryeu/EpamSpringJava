package com.epam.MYelizaryeu.task1.appliances;

abstract public class ElectricAppliance {

    private String name;
    private int id;
    private String type;
    private int power;
    private boolean switchedOn;

    public ElectricAppliance(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setAppliance(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void turnOn() {
        this.setSwitchedOn(true);
    }

    public void turnOff() {
        this.setSwitchedOn(false);
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

    public abstract PowerSource getPowerSource();

    public String getType() {
        return type;
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
