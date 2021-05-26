<<<<<<< HEAD
package com.sportifyshoes.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportifyshoes.admin.dao.AdminLoginRepository;
import com.sportifyshoes.admin.entities.Admin;

@Service
public class AdminLoginService {
	
	@Autowired
	AdminLoginRepository adminRepo;

	
public boolean loginCheck(String name, String pass) {
		
		if(name.equals("admin") && pass.equals("boss")) {
			
			return true;
	
		}
//	List<Admin> admin = (List<Admin>) adminRepo.findAll();
//	
//	for(Admin ad:admin) {
//		if((ad.getAdmin().equals("admin")) && (ad.getPassword().equals("boss"))){
//			System.out.println(ad.getPassword());   
//			return true;
//		}
//	
//	}
		
		return false;
	}

}
=======
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
>>>>>>> a2f5e8553229cde5ec68f182e2ad7f75ddcff0de
