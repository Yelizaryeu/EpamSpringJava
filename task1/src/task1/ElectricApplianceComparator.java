
package task1;

import java.util.Comparator;

import task1.appliances.ElectricAppliance;

public class ElectricApplianceComparator implements Comparator<ElectricAppliance> {

	public int compare(ElectricAppliance ea1, ElectricAppliance ea2) {
		return Integer.compare(ea1.getPower(), ea2.getPower());
		}
	}
