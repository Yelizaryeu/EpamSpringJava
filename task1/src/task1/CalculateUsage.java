
package task1;

import java.util.List;
import task1.appliances.ElectricAppliance;

public class CalculateUsage {
	
	public static int calculatePowerUsage(List<ElectricAppliance> appliances) {
		int result = 0;
		for (ElectricAppliance appliance : appliances) {
			if (appliance.isSwitchedOn()) {
				result += appliance.getPower();
			}
		}
		return result;
	}	
}
