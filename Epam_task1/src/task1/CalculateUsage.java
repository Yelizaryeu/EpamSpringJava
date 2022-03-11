package task1;

import java.util.ArrayList;

import ElectricAppliances.ElectricAppliance;

public class CalculateUsage {
	
	public double CalculateUsageOfPower(ArrayList<ElectricAppliance> List) {
		double result = 0;
		for (ElectricAppliance x : List) {
			if (x.isSwitchedOn()) {
				result += x.getPower();
			}
		}
		return result;
	}	
	
}
