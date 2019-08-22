package com.mucahit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mucahit.entity.Filter;
import com.mucahit.repository.DepartmantDAO;
import com.mucahit.repository.FilterDAO;

@Service
public class FilterService implements FiltreI {
	

	public FilterDAO filterDao;
 
	public FilterService(FilterDAO filterDao) {
		// TODO Auto-generated constructor stub
		this.filterDao=filterDao;
	}
	
	

	@Override
	public List<Filter> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filter getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Filter d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Filter d) {
		// TODO Auto-generated method stub
		
	}

}
