package com.mucahit.entity;



public class History {
	private Integer his_id;
	private Integer m_id;
	private Integer gonderen_adi;
	private Integer alan_adi;
	private String yapilan_is;
	private Integer son_durum;
	private String tarih;

	
	
	
	
	
	public History() {
	
	}

	public History(Integer his_id, Integer m_id, Integer gonderen_adi, Integer alan_adi, String yapilan_is,
			Integer son_durum, String tarih) {
		super();
		this.his_id = his_id;
		this.m_id = m_id;
		this.gonderen_adi = gonderen_adi;
		this.alan_adi = alan_adi;
		this.yapilan_is = yapilan_is;
		this.son_durum = son_durum;
		this.tarih = tarih;
	}
	
	public Integer getHis_id() {
		return his_id;
	}
	public void setHis_id(Integer his_id) {
		this.his_id = his_id;
	}
	public Integer getM_id() {
		return m_id;
	}
	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}
	public Integer getGonderen_adi() {
		return gonderen_adi;
	}
	public void setGonderen_adi(Integer gonderen_adi) {
		this.gonderen_adi = gonderen_adi;
	}
	public Integer getAlan_adi() {
		return alan_adi;
	}
	public void setAlan_adi(Integer alan_adi) {
		this.alan_adi = alan_adi;
	}
	public String getYapilan_is() {
		return yapilan_is;
	}
	public void setYapilan_is(String yapilan_is) {
		this.yapilan_is = yapilan_is;
	}
	public Integer getSon_durum() {
		return son_durum;
	}
	public void setSon_durum(Integer son_durum) {
		this.son_durum = son_durum;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	@Override
	public String toString() {
		return "History [his_id=" + his_id + ", m_id=" + m_id + ", gonderen_adi=" + gonderen_adi + ", alan_adi="
				+ alan_adi + ", yapilan_is=" + yapilan_is + ", son_durum=" + son_durum + ", tarih=" + tarih
				+ ", getHis_id()=" + getHis_id() + ", getM_id()=" + getM_id() + ", getGonderen_adi()="
				+ getGonderen_adi() + ", getAlan_adi()=" + getAlan_adi() + ", getYapilan_is()=" + getYapilan_is()
				+ ", getSon_durum()=" + getSon_durum() + ", getTarih()=" + getTarih() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
