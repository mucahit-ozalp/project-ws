package com.mucahit.Service;

import java.util.List;

import com.mucahit.entity.Departmant;

public interface DepartmantI {

	public List<Departmant> getAll();
	public Departmant getOne(Integer id);
	public void delete(Integer id);
	public void save(Departmant d);
	public void update(Departmant d);
}
