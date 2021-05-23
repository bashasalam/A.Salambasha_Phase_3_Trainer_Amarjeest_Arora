package com.sportifyshoes.admin.services;

import org.springframework.stereotype.Service;

@Service
public class AdminLoginService {

	
public boolean loginCheck(String name, String pass) {
		
		if(name.equals("admin") && pass.equals("manager")) {
			
			return true;
		}
		
		return false;
	}

}
