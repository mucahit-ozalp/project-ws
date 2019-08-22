package com.mucahit.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

@Service
public class JDBCConnection {

    private String kullanici_adi = "root";
    private String parola = "";
    private String db_isim = "kullaniciler";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
   
   

	public String getKullanici_adi() {
		return kullanici_adi;
	}

	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getDb_isim() {
		return db_isim;
	}

	public void setDb_isim(String db_isim) {
		this.db_isim = db_isim;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}

	public void setPreparedStatement(PreparedStatement preparedStatement) {
		this.preparedStatement = preparedStatement;
	}

	
    
    public Connection 	JDBConnection() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_isim + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver bulunamadı");
        }
        try {
            con = (Connection) DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("veritabanı bağlantısı başarılı");
        } catch (SQLException ex) {
            System.out.println("veritabanı bağlantısı başarısız");
            System.out.println(ex.getMessage());
        }
        return con;
    }

	
	
	
}
