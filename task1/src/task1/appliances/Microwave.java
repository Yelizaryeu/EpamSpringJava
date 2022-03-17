
package task1.appliances;

public class Microwave extends MajorAppliance {
	
	private MicrowaveMode microwaveMode;
	
	public Microwave() {
		this.setAppliance("Microwave");;
	}

	public MicrowaveMode getMode() {
		return microwaveMode;
	}
	
	public void setMode(MicrowaveMode microwaveMode) {
		this.microwaveMode = microwaveMode;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType()
				+ ", getPower()=" + getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()="
				+ isSwitchedOn() + ", mode=" + microwaveMode + "]";
	}
}
