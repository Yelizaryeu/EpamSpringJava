package ElectricAppliances;

public class Kettle extends SmallAppliance {
	
	private double Capacity;
	private boolean HasABacklight;
	
	public Kettle(double Capacity, boolean HasBacklight) {
		this.setAppliance("Kettle");
		this.Capacity = Capacity;
		this.HasABacklight = HasBacklight;
	}

	@Override
	public String getSourceOfPower() {
		return "plug";
	}

	public double getCapacity() {
		return Capacity;
	}

	public boolean isHasBacklight() {
		return HasABacklight;
	}
	
	@Override
	public String toString() {
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tCapacity = " + Capacity + " L"
	            + ",\n\tHas a backlight = " + HasABacklight
	            + "\n";
	}

}
