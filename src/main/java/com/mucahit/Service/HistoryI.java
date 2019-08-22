package com.mucahit.Service;

import java.util.List;


import com.mucahit.entity.History;

public interface HistoryI {
	
	public List<History> getAll();
	public History getOne(Integer id);
	public void delete(Integer id);
	public void save(History d);
	public void update(History d);

}
