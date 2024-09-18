package com.vickee.service;

import java.util.List;

import com.vickee.model.Role;

public interface RoleService {
	
	public void addRole(Role role);
	public List<String> getAllNames();
	public List<Role> getAllRoles();
	public Role fetchRoleByName(String name);
	public List<Long> fetchAllRids();
}
