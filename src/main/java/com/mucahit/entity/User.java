package com.mucahit.entity;

public class User {
	private Integer k_id;
	private String kullanici_adi;
	private String parola;
	private Integer hatali_giris;
	private String giris_tarihi;
	private String blok_tarih;
	private Integer dk_id;
	
	
	public User(Integer k_id, String kullanici_adi, String parola, Integer hatali_giris, String giris_tarihi,
			String blok_tarih, Integer dk_id) {
		
		this.k_id = k_id;
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.hatali_giris = hatali_giris;
		this.giris_tarihi = giris_tarihi;
		this.blok_tarih = blok_tarih;
		this.dk_id = dk_id;
	}
	public User() {
		
	}
	public Integer getK_id() {
		return k_id;
	}
	public void setK_id(Integer k_id) {
		this.k_id = k_id;
	}
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
	public Integer getHatali_giris() {
		return hatali_giris;
	}
	public void setHatali_giris(Integer hatali_giris) {
		this.hatali_giris = hatali_giris;
	}
	
	public String getGiris_tarihi() {
		return giris_tarihi;
	}
	public void setGiris_tarihi(String giris_tarihi) {
		this.giris_tarihi = giris_tarihi;
	}
	public String getBlok_tarih() {
		return blok_tarih;
	}
	public void setBlok_tarih(String blok_tarih) {
		this.blok_tarih = blok_tarih;
	}
	public Integer getDk_id() {
		return dk_id;
	}
	public void setDk_id(Integer dk_id) {
		this.dk_id = dk_id;
	}
	@Override
	public String toString() {
		return "User [k_id=" + k_id + ", kullanici_adi=" + kullanici_adi + ", parola=" + parola + ", hatali_giris="
				+ hatali_giris + ", giris_tarih=" + giris_tarihi + ", blok_tarih=" + blok_tarih + ", dk_id=" + dk_id
				+ ", getK_id()=" + getK_id() + ", getKullanici_adi()=" + getKullanici_adi() + ", getParola()="
				+ getParola() + ", getHatali_giris()=" + getHatali_giris() + ", getGiris_tarih()=" + getGiris_tarihi()
				+ ", getBlok_tarih()=" + getBlok_tarih() + ", getDk_id()=" + getDk_id() + "]";
	}
	

}
