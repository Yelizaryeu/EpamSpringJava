package ElectricAppliances;

public class AlarmClock extends SmallAppliance {
	
	private String color;
	
	public AlarmClock(String color) {
		this.setAppliance("Alarm clock");
	}

	@Override
	public String getSourceOfPower() {
		return "Battery";
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tColor = " + color
	            + "\n";
	}
}
