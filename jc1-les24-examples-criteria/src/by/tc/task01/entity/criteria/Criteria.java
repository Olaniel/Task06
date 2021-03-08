package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<T1, T2> {

	private String groupSearchName;
	private Map<T1, T2> criteria = new HashMap<T1, T2>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(T1 searchCriteria, T2 value) {
		criteria.put(searchCriteria, value);
	}

	public Map<T1, T2> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<T1, T2> criteria) {
		this.criteria = criteria;
	}
	
	

}
