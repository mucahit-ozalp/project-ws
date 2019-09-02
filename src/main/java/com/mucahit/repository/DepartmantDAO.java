package com.mucahit.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.Service.DepartmantI;
import com.mucahit.Service.JDBCConnection;
import com.mucahit.entity.Departmant;

import SQLQueriesPackage.Sqlqueries;

@Service
public class DepartmantDAO implements DepartmantI {

	public JDBCConnection jdbcConnect;
	// public Departmant departmant;

	public DepartmantDAO(JDBCConnection jdbcConnect) {
		this.jdbcConnect = jdbcConnect;
	}

	@Override
	public List<Departmant> getAll() {

		Departmant departmant;
		List<Departmant> list = new ArrayList<Departmant>();
 
		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.GET_ALL_DEPARTMENT);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				departmant = new Departmant();
				departmant.setD_id(rs.getInt("d_id"));
				departmant.setComponent(rs.getInt("companent"));
				departmant.setDepartmant(rs.getInt("departman"));
				list.add(departmant);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Departmant getOne(Integer id) {

		Departmant departmant=null;

		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection()
					.prepareStatement(Sqlqueries.get_one_department);
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				departmant = new Departmant();

				departmant.setD_id(rs.getInt("d_id"));
				departmant.setComponent(rs.getInt("companent"));
				departmant.setDepartmant(rs.getInt("departman"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return departmant;

	}

	@Override
	public void delete(Integer id) {
		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_delete_department);
			
			preparedStatement.setInt(1, id);
		
			preparedStatement.executeUpdate();		

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}


	}
	

	@Override
	public void save(Departmant d) {
		
		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_save_department);
			
			preparedStatement.setInt(1, d.getDepartmant( ));
			preparedStatement.setInt(2, d.getComponent());
			
			preparedStatement.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void update(Departmant d) {
		
		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_update_department);
			
			preparedStatement.setInt(1, d.getDepartmant());
			preparedStatement.setInt(2, d.getComponent());
			preparedStatement.setInt(3, d.getD_id());
			
			preparedStatement.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
