package com.mucahit.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.Service.HistoryI;
import com.mucahit.Service.JDBCConnection;

import com.mucahit.entity.History;

import SQLQueriesPackage.Sqlqueries;
@Service
public class HistoryDAO implements HistoryI {
	
	
	public JDBCConnection jdbcConnect;
	

	

	public HistoryDAO(JDBCConnection jdbcConnect) {
		
		this.jdbcConnect = jdbcConnect;
	}

	@Override
	public List<History> getAll() {
		History history;
		List<History> list = new ArrayList<History>();
		//jdbcConnect = new JDBCConnection();
		try {
			
			PreparedStatement preparedStatement = jdbcConnect.getPreparedStatement();
			
			ResultSet rs = preparedStatement.executeQuery(Sqlqueries.GET_ALL_DEPARTMENT);
			while (rs.next()) {
				history = new History();
				history.setHis_id(rs.getInt("his_id"));
				history.setM_id(rs.getInt("m_id"));
				history.setGonderen_adi(rs.getInt("gonderen_adi"));
				history.setAlan_adi(rs.getInt("alan_adi"));
				history.setYapilan_is(rs.getString("yapilan_is"));
				history.setSon_durum(rs.getInt("son_durum"));
				history.setTarih(rs.getString("tarih"));
				
				list.add(history);
				
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		
	}

	@Override
	public History getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(History d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(History d) {
		// TODO Auto-generated method stub
		
	}


}
