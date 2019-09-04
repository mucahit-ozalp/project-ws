package com.mucahit.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.Service.JDBCConnection;
import com.mucahit.Service.UserI;
import com.mucahit.entity.User;

import SQLQueriesPackage.Sqlqueries;

@Service
public class UserDAO implements UserI {
	public JDBCConnection jdbcConnect;

	public UserDAO(JDBCConnection jdbcConnect) {
		this.jdbcConnect = jdbcConnect;
	}

	@Override
	public User accessUser(String kullanici_adi, String parola) {

		User user = new User();

		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection()
					.prepareStatement(Sqlqueries.get_login_user);
			preparedStatement.setString(1, kullanici_adi);
			preparedStatement.setString(2, parola);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {

				user.setK_id(rs.getInt("k_id"));
				user.setKullanici_adi(rs.getString("kullanici_adi"));
				user.setHatali_giris(rs.getInt("hatali_giris"));
				user.setGiris_tarihi(rs.getString("giris_tarihi"));
				user.setBlok_tarih(rs.getString("blok_tarih"));
				user.setDk_id(rs.getInt("dk_id"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			user = null;
			e.printStackTrace();
		}

		return user;

	}

	@Override
	public void updatehata(User u) {
		
		try {
			PreparedStatement preparedStatement = jdbcConnect.JDBConnection()
					.prepareStatement(Sqlqueries.get_updatehata_user);
			preparedStatement.setInt(1, u.getHatali_giris());
			preparedStatement.setString(2, u.getKullanici_adi());

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	// @Override
	// public User updateblok(String blok_tarih) {

	// return user;
	// }

}
