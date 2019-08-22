package com.mucahit.repository;

import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.Service.FiltreI;
import com.mucahit.Service.JDBCConnection;
import com.mucahit.entity.Departmant;
import com.mucahit.entity.Filter;

import SQLQueriesPackage.Sqlqueries;

@Service
public class FilterDAO implements FiltreI {
	
	public JDBCConnection jdbcConnect;

	public FilterDAO(JDBCConnection jdbcConnect) {
		this.jdbcConnect = jdbcConnect;
	}

	@Override
	public List<Filter> getAll() {
		Filter filter;
		List<Filter> list = new ArrayList<Filter>();
		jdbcConnect = new JDBCConnection();
		try {
			
			PreparedStatement preparedStatement = jdbcConnect.getPreparedStatement();
			
			ResultSet rs = preparedStatement.executeQuery(Sqlqueries.get_all_filter);
			while (rs.next()) {
				filter = new Filter();
				filter.setF_id(rs.getInt("f_id"));
				filter.setFk_id(rs.getInt("fk_id"));
				filter.setSorgu(rs.getString("sorgu"));
				filter.setSorgu_adi(rs.getString("sorgu_adi"));
				list.add(filter);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		
	}

	@Override
	public Filter getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Filter d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Filter d) {
		// TODO Auto-generated method stub
		
	}

}
