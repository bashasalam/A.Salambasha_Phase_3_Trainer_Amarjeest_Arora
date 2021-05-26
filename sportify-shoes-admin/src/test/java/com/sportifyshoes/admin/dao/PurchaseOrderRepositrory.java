package com.sportifyshoes.admin.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportifyshoes.admin.entities.PurchaseOrder;

@Repository
public interface PurchaseOrderRepositrory extends CrudRepository<PurchaseOrder,Long> {

}
