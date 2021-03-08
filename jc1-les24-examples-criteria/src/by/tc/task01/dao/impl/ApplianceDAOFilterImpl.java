package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.ApplianceDAOFilter;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOFilterImpl implements ApplianceDAOFilter {
	

	@Override
	public boolean filter(String data, Criteria<String, Object> criteria) {
		List<Pattern> patterns = new ArrayList<Pattern>();
		Matcher matcher;
		String info;
		
		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			info ="[\\s+,]"+entry.getKey() + "=" + entry.getValue()+"[\\s+,]";
			patterns.add(Pattern.compile(info, Pattern.CASE_INSENSITIVE));
		}
		
		for (Pattern pattern : patterns) {
			matcher = pattern.matcher(data);
			
			if(!matcher.find()) {
				return false;
			}
		}
		return true;
	}

}
