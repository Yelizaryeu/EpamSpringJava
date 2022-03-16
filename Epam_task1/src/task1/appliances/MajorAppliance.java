
package task1.appliances;

abstract public class MajorAppliance extends ElectricAppliance {

	public MajorAppliance() {
		super("major");
	}
	
	@Override
	public SourcePower getSourcePower() {
		return SourcePower.PLUG;
	}
}
