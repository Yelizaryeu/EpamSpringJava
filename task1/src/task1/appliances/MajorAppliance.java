
package task1.appliances;

abstract class MajorAppliance extends ElectricAppliance {

	public MajorAppliance() {
		super("Major");
	}
	
	@Override
	public SourcePower getSourcePower() {
		return SourcePower.PLUG;
	}
}
