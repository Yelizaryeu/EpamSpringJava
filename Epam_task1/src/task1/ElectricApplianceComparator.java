package task1;

import java.util.Comparator;

import ElectricAppliances.ElectricAppliance;

public class ElectricApplianceComparator implements Comparator<ElectricAppliance> {

	public int compare(ElectricAppliance o1, ElectricAppliance o2) {
		return Integer.compare(o1.getPower(), o2.getPower());
		}
	}

