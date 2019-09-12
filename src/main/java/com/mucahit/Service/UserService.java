package com.mucahit.Service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mucahit.entity.User;
import com.mucahit.repository.UserDAO;
@Repository
@Service
public class UserService implements UserI{
	public UserDAO userDao;
	
	

	public UserService(UserDAO userDao) {
		
		this.userDao = userDao;
	}



	@Override
	public User accessUser(String kullanici_adi, String parola) {
		
		return userDao.accessUser(kullanici_adi, parola) ;
	}



	@Override
	public void updatehata(User u) {
		 userDao.updatehata(u);
		
	}



	@Override
	public List<User> assignee(Integer dk_id) {
		
		return userDao.assignee(dk_id);
	}

}
