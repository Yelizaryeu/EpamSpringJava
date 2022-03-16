
package task1.appliances;

public class Dishwasher extends MajorAppliance{
	
	private double OperationVolume;
	
	public Dishwasher() {
		this.setAppliance("Dishwasher");
	}

	public double getOperationVolume() {
		return OperationVolume;
	}

	public void setOperationVolume(double operationVolume) {
		OperationVolume = operationVolume;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType()
				+ ", getPower()=" + getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()="
				+ isSwitchedOn() + ", OperationVolume=" + OperationVolume + "]";
	}
	
	
	
}
