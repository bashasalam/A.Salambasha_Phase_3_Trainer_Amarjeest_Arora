<<<<<<< HEAD
package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private long id;

	private String admin;
	private String password;
	public Admin() {
		super();
	}
	public Admin(String admin, String password) {
		super();
		
		this.admin = admin;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin=" + admin + ", password=" + password + "]";
	}
	
	

}
=======
package com.sportifyshoes.admin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private String userName;
	private String password;

}
>>>>>>> a2f5e8553229cde5ec68f182e2ad7f75ddcff0de
