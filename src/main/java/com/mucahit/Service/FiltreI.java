package com.mucahit.Service;

import java.util.List;

import com.mucahit.entity.Filter;




public interface FiltreI {

	public List<Filter> getAll();
	public Filter getOne(Integer id);
	public void delete(Integer id);
	public void save(Filter d);
	public void update(Filter d);
}
