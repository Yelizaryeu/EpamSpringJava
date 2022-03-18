package task1.appliances;

public class Microwave extends MajorAppliance {

    private MicrowaveMode microwaveMode;

    public Microwave() {
        this.setAppliance("Microwave");
    }

    public MicrowaveMode getMode() {
        return microwaveMode;
    }

    public void setMode(MicrowaveMode microwaveMode) {
        this.microwaveMode = microwaveMode;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                ", microwaveMode=" + microwaveMode +
                ", sourcePower=" + getSourcePower() +
                '}';
    }
}
