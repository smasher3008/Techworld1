package com.Techworld.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Techworld.model.Product;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleDAO rdao;
	
	@Transactional
	public List<Role> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public void insert(Role r) {
		// TODO Auto-generated method stub
		rdao.insert(r);
	}
	
	@Transactional
	public void delete(Role rd) {
		// TODO Auto-generated method stub
		
	}
	
	
}
