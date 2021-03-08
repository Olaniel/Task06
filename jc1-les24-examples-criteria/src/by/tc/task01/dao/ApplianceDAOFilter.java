package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAOFilter {
     boolean filter(String data,Criteria<String, Object> criteria);
}
