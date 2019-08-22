package com.mucahit.entity;

public class Filter {
	private Integer f_id;
	private Integer fk_id;
	private String sorgu_adi;
	public String sorgu;

	public Filter(Integer f_id, Integer fk_id, String sorgu_adi, String sorgu) {
		super();
		this.f_id = f_id;
		this.fk_id = fk_id;
		this.sorgu_adi = sorgu_adi;
		this.sorgu = sorgu;
	}
	

	public Filter() {
	
	}


	public Integer getF_id() {
		return f_id;
	}

	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	public Integer getFk_id() {
		return fk_id;
	}

	public void setFk_id(Integer fk_id) {
		this.fk_id = fk_id;
	}

	public String getSorgu_adi() {
		return sorgu_adi;
	}

	public void setSorgu_adi(String sorgu_adi) {
		this.sorgu_adi = sorgu_adi;
	}

	public String getSorgu() {
		return sorgu;
	}

	public void setSorgu(String sorgu) {
		this.sorgu = sorgu;
	}


	@Override
	public String toString() {
		return "Filter [f_id=" + f_id + ", fk_id=" + fk_id + ", sorgu_adi=" + sorgu_adi + ", sorgu=" + sorgu
				+ ", getF_id()=" + getF_id() + ", getFk_id()=" + getFk_id() + ", getSorgu_adi()=" + getSorgu_adi()
				+ ", getSorgu()=" + getSorgu() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}
