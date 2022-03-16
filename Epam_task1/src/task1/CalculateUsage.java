
package task1;

import java.util.ArrayList;

import task1.appliances.ElectricAppliance;

public class CalculateUsage {
	
	public static double calculatePowerUsage(ArrayList<ElectricAppliance> appliances) {
		double result = 0;
		for (ElectricAppliance appliance : appliances) {
			if (appliance.isSwitchedOn()) {
				result += appliance.getPower();
			}
		}
		return result;
	}	
	
}
