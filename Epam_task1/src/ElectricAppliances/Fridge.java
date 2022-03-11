package ElectricAppliances;

public class Fridge extends MajorAppliance{
	
	private boolean HasAFreezer;
	
	public Fridge(boolean HasAFreezer) {
		this.setAppliance("Fridge");
		this.HasAFreezer = HasAFreezer;
	}

	public boolean isHasAFreezer() {
		return HasAFreezer;
	}

	@Override
	public String toString() {
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tHas a freezer = " + HasAFreezer
	            + "\n";
	}
	
}
