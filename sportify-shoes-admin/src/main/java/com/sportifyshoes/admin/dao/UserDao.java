package com.sportifyshoes.admin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.model.User;

import com.sportifyshoes.admin.entities.User;
@Repository
public interface UserDao extends CrudRepository<User,Long> {
	
	

}
