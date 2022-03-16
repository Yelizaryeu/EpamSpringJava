
package task1;

import java.util.ArrayList;

import task1.appliances.ElectricAppliance;

public class Filter {
	public static ArrayList<ElectricAppliance> filterByPower(ArrayList<ElectricAppliance> appliances, double minPower, double maxPower){
		ArrayList<ElectricAppliance> List = new ArrayList<>();
		for (ElectricAppliance x : appliances) {
			if (x.getPower() >= minPower && x.getPower() <= maxPower) {
				List.add(x);
			}
		}
		return List;
	}
}
