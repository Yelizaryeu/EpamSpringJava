
package task1.appliances;

public class AlarmClock extends SmallAppliance {
	
	private final String color;
	
	public AlarmClock(String color) {
		this.setAppliance("Alarm clock");
		this.color = color;
	}

	@Override
	public SourcePower getSourcePower() {
		return SourcePower.BATTERY;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType()
				+ ", getPower()=" + getPower() + ", isSwitchedOn()=" + isSwitchedOn() + ", getSourcePower()="
				+ getSourcePower() + ", color=" + color + "]";
	}
}
