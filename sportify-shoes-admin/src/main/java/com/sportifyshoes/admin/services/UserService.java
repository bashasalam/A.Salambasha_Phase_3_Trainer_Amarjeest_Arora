package com.sportifyshoes.admin.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
	
	public List<User> checkUser(String name, String pass) {
		// TODO Auto-generated method stub
		List<User>  user= userDao.chekUser(name,pass);
		
		System.out.println(user);
		//session.setAttribute("user", user);
		return user;
	}

	public List<User> getUserList() {
		
		List<User> user = (List<User>) userDao.findAll();
		
		return user;
		// TODO Auto-generated method stub
		
	}
	

	

}
