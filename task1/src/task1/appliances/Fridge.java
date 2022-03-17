
package task1.appliances;

public class Fridge extends MajorAppliance{
	
	private final boolean hasFreezer;
	
	public Fridge(boolean hasFreezer) {
		this.setAppliance("Fridge");
		this.hasFreezer = hasFreezer;
	}

	public boolean isHasFreezer() {
		return hasFreezer;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPower()="
				+ getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()=" + isSwitchedOn()
				+ ", HasFreezer=" + hasFreezer + "]";
	}
}
