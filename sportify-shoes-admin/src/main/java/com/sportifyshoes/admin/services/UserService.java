package com.sportifyshoes.admin.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportifyshoes.admin.dao.UserDao;
import com.sportifyshoes.admin.entities.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	ArrayList<User> al = new ArrayList<User>();

	public boolean addUser(String name, String pass, String email, String city) {
		

	//	al.add(new User(name, pass, email, city));
		//System.out.println(al);
		if(userDao.save(new User(name, pass, email, city)) != null) {
			
			return true;
		}else {
			
			return false;
		}
		
		
		
	}
	

}
