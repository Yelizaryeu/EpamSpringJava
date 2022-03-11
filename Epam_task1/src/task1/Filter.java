package task1;

import java.util.ArrayList;

import ElectricAppliances.ElectricAppliance;

public class Filter {
	public ArrayList<ElectricAppliance> FilterByPower(ArrayList<ElectricAppliance> Appliances, double a, double b){
		ArrayList<ElectricAppliance> List = new ArrayList<>();
		for (ElectricAppliance x : Appliances) {
			if (x.getPower() >= a && x.getPower() <= b) {
				List.add(x);
			}
		}
		return List;
	}
}
