package com.Techworld.security;

import java.util.List;

import com.Techworld.model.Product;

public interface RoleService {
	
	public List<Role> list();

	public void insert(Role r);

	public void delete(Role rd);


}
