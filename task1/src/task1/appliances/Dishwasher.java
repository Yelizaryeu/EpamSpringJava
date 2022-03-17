
package task1.appliances;

public class Dishwasher extends MajorAppliance{
	
	private double operationVolume;
	
	public Dishwasher() {
		this.setAppliance("Dishwasher");
	}

	public double getOperationVolume() {
		return operationVolume;
	}

	public void setOperationVolume(double operationVolume) {
		this.operationVolume = operationVolume;
	}

	@Override
	public String toString() {
		return "Appliance info [getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType()
				+ ", getPower()=" + getPower() + ", getSourcePower()=" + getSourcePower() + ", isSwitchedOn()="
				+ isSwitchedOn() + ", OperationVolume=" + operationVolume + "]";
	}
}
