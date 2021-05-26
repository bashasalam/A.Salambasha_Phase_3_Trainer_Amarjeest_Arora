package com.sportifyshoes.admin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportifyshoes.admin.entities.Admin;
//import com.sportifyshoes.admin.entities.Product;

@Repository
public interface AdminLoginRepository extends CrudRepository<Admin,Long> {
	

}
