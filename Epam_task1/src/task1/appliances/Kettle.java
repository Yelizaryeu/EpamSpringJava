
package task1.appliances;

public class Kettle extends SmallAppliance {
	
	private final double capacity;
	private final boolean hasBacklight;
	
	public Kettle(double capacity, boolean hasBacklight) {
		this.setAppliance("Kettle");
		this.capacity = capacity;
		this.hasBacklight = hasBacklight;
	}

	@Override
	public SourcePower getSourcePower() {
		return SourcePower.PLUG;
	}

	public double getCapacity() {
		return capacity;
	}

	public boolean isHasBacklight() {
		return hasBacklight;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPower()="
				+ getPower() + ", isSwitchedOn()=" + isSwitchedOn() + ", getSourcePower()=" + getSourcePower()
				+ ", capacity=" + capacity + ", hasBacklight=" + hasBacklight + "]";
	}
	
	

}
