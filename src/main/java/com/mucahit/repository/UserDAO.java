package com.mucahit.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.Service.JDBCConnection;
import com.mucahit.Service.UserI;
import com.mucahit.entity.Departmant;
import com.mucahit.entity.User;

import SQLQueriesPackage.Sqlqueries;

@Service
public class UserDAO implements UserI {
	public JDBCConnection jdbcConnect;
	public User user;

	public UserDAO(JDBCConnection jdbcConnect) {
		this.jdbcConnect = jdbcConnect;
	}
	public UserDAO(User user)
	{
		this.user=user;
	}

	@Override
	public User accessUser(String kullanici_adi, String parola) {

		user=null;

		try {

			PreparedStatement preparedStatement = jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_login_user);
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
			if(user.getKullanici_adi()==null) {
				preparedStatement =jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_login_hata_user);
				preparedStatement.setString(1, kullanici_adi);
				rs= preparedStatement.executeQuery();
				while(rs.next()) 
				{
					user.setHatali_giris(rs.getInt("hatali_giris"));
					user.setBlok_tarih(rs.getString("blok_tarih"));
				
			}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

		return user;

	}

	@Override
	public void updatehata(User u) {
		
		
		try {
			PreparedStatement preparedStatement = jdbcConnect.JDBConnection()
					.prepareStatement(Sqlqueries.get_update_hata);
			preparedStatement.setInt(1, u.getHatali_giris());
			preparedStatement.setString(2, u.getKullanici_adi());

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if(u.getHatali_giris()>=3)
			try {
				PreparedStatement preparedStatement = jdbcConnect.JDBConnection()
						.prepareStatement(Sqlqueries.get_uptade_blokTarih_user);				
				preparedStatement.setString(1, u.getKullanici_adi());

				preparedStatement.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		
		

	}

	@Override
	public List<User> assignee(Integer dk_id) {
		user=null;
		List<User> list = new ArrayList<User>();
		
		try {
			PreparedStatement preparedStatement=jdbcConnect.JDBConnection().prepareStatement(Sqlqueries.get_assigne_user);
			preparedStatement.setInt(1, dk_id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next())
			{
				user.setK_id(rs.getInt("k_id"));
				user.setKullanici_adi(rs.getString("kullanici_adi"));
				user.setHatali_giris(rs.getInt("hatali_giris"));
				user.setGiris_tarihi(rs.getString("giris_tarihi"));
				user.setBlok_tarih(rs.getString("blok_tarih"));
				user.setDk_id(rs.getInt("dk_id"));
				list.add(user);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	


}
