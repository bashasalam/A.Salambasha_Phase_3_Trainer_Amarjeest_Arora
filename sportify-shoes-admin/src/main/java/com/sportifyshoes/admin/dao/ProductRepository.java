package com.sportifyshoes.admin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportifyshoes.admin.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
	
	@Override
	public List<Product> findAll();
	//public List<Product> findById(Long id);
}
