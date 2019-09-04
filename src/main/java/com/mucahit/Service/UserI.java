package com.mucahit.Service;

import java.util.List;

import com.mucahit.entity.User;

public interface UserI {
	 public User accessUser(String kullanici_adi,String parola);
	 public void updatehata(User u);
	// public User updateblok(String blok_tarih);

}
