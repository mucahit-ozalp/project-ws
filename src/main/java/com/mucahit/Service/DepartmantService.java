package com.mucahit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.entity.Departmant;
import com.mucahit.repository.DepartmantDAO;

@Service
public class DepartmantService implements DepartmantI{

	public DepartmantDAO departmantDao;
 
	public DepartmantService(DepartmantDAO departmantDao) {
		this.departmantDao = departmantDao;
	}

	@Override
	public List<Departmant> getAll() {
		return departmantDao.getAll();
	}

	@Override
	public Departmant getOne(Integer id) {
		return departmantDao.getOne(id);
	}

	@Override
	public void delete(Integer id) {
		departmantDao.delete(id);
		
		
	}

	@Override
	public void save(Departmant d) {
		// TODO Auto-generated method stub
		departmantDao.save(d);
		
	}

	@Override
	public void update(Departmant d) {
		departmantDao.update(d);
		
	}
	
	

}
