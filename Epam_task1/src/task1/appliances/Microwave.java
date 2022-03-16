
package task1.appliances;

public class Microwave extends MajorAppliance {
	
	private MicrowaveMode mode;
	
	public Microwave() {
		this.setAppliance("Microwave");;
	}

	public MicrowaveMode getMode() {
		return mode;
	}
	
	public void setMode(MicrowaveMode Mode) {
		this.mode = Mode;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType()
				+ ", getPower()=" + getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()="
				+ isSwitchedOn() + ", mode=" + mode + "]";
	}

	
		
	}