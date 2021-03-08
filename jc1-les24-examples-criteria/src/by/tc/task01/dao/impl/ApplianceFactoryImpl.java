package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceFactoryImpl implements ApplianceFactory {

	@Override
	public Appliance newAppliance(Criteria<String, Object> criteria, String info) {
		if ("Oven".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new Oven(info);
		} else if ("Laptop".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new Laptop(info);
		} else if ("Refrigerator".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new Refrigerator(info);
		} else if ("VacuumCleaner".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new VacuumCleaner(info);
		} else if ("TabletPC".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new TabletPC(info);
		} else if ("Speakers".equalsIgnoreCase(criteria.getGroupSearchName())) {
			return new Speakers(info);
		} else {
			return new Appliance();
		}

	}

}
