package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria<String, Object> criteria) {
		if (criteria.getCriteria().isEmpty()) {
			return false;
		}
		if (criteria.getGroupSearchName().equals(null) || "".equals(criteria.getGroupSearchName())) {
			return false;
		}

		return true;
	}

}

