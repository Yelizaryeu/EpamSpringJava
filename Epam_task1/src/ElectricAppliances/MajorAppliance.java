package ElectricAppliances;

abstract public class MajorAppliance extends ElectricAppliance {

	public MajorAppliance() {
		super("major");
	}
	
	@Override
	public String getSourceOfPower() {
		return "plug";
	}
	

}
