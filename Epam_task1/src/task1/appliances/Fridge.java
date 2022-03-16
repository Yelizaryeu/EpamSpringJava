
package task1.appliances;

public class Fridge extends MajorAppliance{
	
	private final boolean HasFreezer;
	
	public Fridge(boolean HasFreezer) {
		this.setAppliance("Fridge");
		this.HasFreezer = HasFreezer;
	}

	public boolean isHasFreezer() {
		return HasFreezer;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPower()="
				+ getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()=" + isSwitchedOn()
				+ ", HasFreezer=" + HasFreezer + "]";
	}

	

	
	
}
