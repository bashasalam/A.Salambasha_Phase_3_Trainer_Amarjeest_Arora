package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private String userName;
	private String password;

}
