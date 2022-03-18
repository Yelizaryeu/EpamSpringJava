package task1.appliances;

public class Kettle extends SmallAppliance {

    private final double capacity;
    private final boolean hasBacklight;

    public Kettle(double capacity, boolean hasBacklight) {
        this.setAppliance("Kettle");
        this.capacity = capacity;
        this.hasBacklight = hasBacklight;
    }

    @Override
    public SourcePower getSourcePower() {
        return SourcePower.PLUG;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isHasBacklight() {
        return hasBacklight;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                ", capacity=" + capacity +
                ", hasBacklight=" + hasBacklight +
                ", sourcePower=" + getSourcePower() +
                '}';
    }
}
