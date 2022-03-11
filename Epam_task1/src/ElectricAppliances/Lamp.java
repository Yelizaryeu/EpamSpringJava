package ElectricAppliances;

public class Lamp extends SmallAppliance{
	
	private int Brightness;
	
	public Lamp() {
		this.setAppliance("Lamp");
	}
	
	@Override
	public String getSourceOfPower() {
		return "battery";
	}

	public int getBrightness() {
		return Brightness;
	}

	public void setBrightness(int brightness) {
		if (brightness >= 0 && brightness <= 100) {
		Brightness = brightness;
		} else {
			Brightness = 0;
		}
	}
	
	@Override
	public String toString() {
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tBrightness = " + Brightness
	            + "\n";
	}
	
}
