package com.mucahit.entity;




public class Departmant {
	private Integer d_id;
	private Integer departmant;
	private Integer component;

	public Departmant(Integer d_id, Integer departmant, Integer component) {
		super();
		this.d_id = d_id;
		this.departmant = departmant;
		this.component = component;
	}
	public Departmant() {};
	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}

	public Integer getDepartmant() {
		return departmant;
	}

	public void setDepartmant(Integer departmant) {
		this.departmant = departmant;
	}

	public Integer getComponent() {
		return component;
	}

	public void setComponent(Integer component) {
		this.component = component;
	}

	@Override
	public String toString() {
		return "Departmant [d_id=" + d_id + ", departmant=" + departmant + ", component=" + component + "]";
	}

}
