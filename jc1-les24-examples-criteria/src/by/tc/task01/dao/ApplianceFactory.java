package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceFactory {
     Appliance newAppliance(Criteria<String, Object> criteria,String info);
    	 
     
}
