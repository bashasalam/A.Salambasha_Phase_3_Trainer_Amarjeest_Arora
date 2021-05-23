package com.sportifyshoes.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import com.model.User;

import com.sportifyshoes.admin.entities.User;

@Repository
public interface UserDao extends CrudRepository<User,Long> {

	
	
	//@Query(nativeQuery=true, value = "")
	//public List<User> checkUser();
	@Query( value = "select * from user u where u.uname = :uname and u.pass = :password",nativeQuery=true)
	public List<User> chekUser(@Param("uname") String name, @Param("password") String pass);
	
}
