package ElectricAppliances;

public class Microwave extends MajorAppliance {
	
	private MicrowaveMode Mode;
	
	public Microwave() {
		this.setAppliance("Microwave");;
	}

	public MicrowaveMode getMode() {
		return Mode;
	}
	
	public void setMode(MicrowaveMode Mode) {
		this.Mode = Mode;
	}

	@Override
	public String toString() {
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tPower mode = " + Mode
	            + "\n";
	}
		
	}