package ElectricAppliances;

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
	    return "\n\tid = " + getId()
	    		+ ",\n\tName = " + getName()
	            + ",\n\tType = " + getType()
	            + ",\n\tPower = " + getPower() + " Watt"
	            + ",\n\tSwitched on = " + isSwitchedOn()
	            + ",\n\tSource of power = " + getSourceOfPower()
	            + ",\n\tOperation Volume = " + OperationVolume + " dB"
	            + "\n";
	}
	
}
