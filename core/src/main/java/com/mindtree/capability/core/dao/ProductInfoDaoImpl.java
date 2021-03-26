package com.mindtree.capability.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.capability.core.utility.DaoUtilities;

public class ProductInfoDaoImpl implements ProductInfoDao{

	List<String> data = new ArrayList<String>();
	@Override
	public List<String> getdata() {
		
		Connection connection=DaoUtilities.getConnection();
		try {
			PreparedStatement ps= connection.prepareStatement("select * from CategoryData;");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				data.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
