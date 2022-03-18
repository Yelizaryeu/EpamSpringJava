package task1.appliances;

public class Lamp extends SmallAppliance {

    private int brightness;

    public Lamp() {
        this.setAppliance("Lamp");
    }

    @Override
    public SourcePower getSourcePower() {
        return SourcePower.BATTERY;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            brightness = 0;
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
                ", sourcePower=" + getSourcePower() +
                '}';
    }
}
