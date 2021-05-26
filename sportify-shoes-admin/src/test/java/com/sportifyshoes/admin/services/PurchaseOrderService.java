package com.sportifyshoes.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportifyshoes.admin.dao.PurchaseOrderRepositrory;
import com.sportifyshoes.admin.entities.PurchaseOrder;

@Service
public class PurchaseOrderService {

	@Autowired
	PurchaseOrderRepositrory por;
	public List<PurchaseOrder> getPurchaseList() {
		
		List<PurchaseOrder> list = (List<PurchaseOrder>) por.findAll();
		
		return list;
	}

}
