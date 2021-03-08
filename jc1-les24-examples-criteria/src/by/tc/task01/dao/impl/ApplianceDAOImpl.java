package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {
	private static final String PATH = "resources/appliances_db.txt";
	private BufferedReader bufferedReader;

	@Override
	public List<Appliance> find(Criteria<String, Object> criteria) throws DAOException {

		String data;
		List<Appliance> appliances = new ArrayList<Appliance>();

		ApplianceDAOFilterImpl applianceDAOFilterImpl = new ApplianceDAOFilterImpl();
		ApplianceFactory factory = new ApplianceFactoryImpl();

		try {
			bufferedReader = new BufferedReader(new FileReader(PATH));
			while (bufferedReader.ready()) {
				data = bufferedReader.readLine();
				if (applianceDAOFilterImpl.filter(data, criteria) == true) {
					appliances.add(factory.newAppliance(criteria, data));
				}

			}

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return appliances;

	}
}
