package com.mindtree.capability.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.capability.core.bean.SlingCapabilityEntity;
import com.mindtree.capability.core.utility.DaoSlingUtility;


public class SlingCapabilityDaoImpl implements SlingCapabilityDao {


	List<SlingCapabilityEntity> data = new ArrayList<>();
	@Override
	public List<SlingCapabilityEntity> getdata() {
		Connection connection=DaoSlingUtility.getConnection();
		try {
			PreparedStatement ps= connection.prepareStatement("select * from city;");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id= rs.getInt(1);
				String name=rs.getString(2);
				String countryCode=rs.getString(3);
				String district=rs.getString(4);
				int population=rs.getInt(5);
				data.add(new SlingCapabilityEntity(id, name, countryCode, district, population));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
