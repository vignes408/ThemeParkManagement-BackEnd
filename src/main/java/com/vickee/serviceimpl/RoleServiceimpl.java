package com.vickee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Role;
import com.vickee.repository.RoleRepo;
import com.vickee.service.RoleService;

@Service
public class RoleServiceimpl implements RoleService {

    @Autowired
    RoleRepo repo;

    @Override
    public List<String> getAllNames() {
        return repo.fetchAllNames();
    }

    @Override
    public List<Role> getAllRoles() {
        return repo.findAll();
    }

    @Override
    public Role fetchRoleByName(String name) {
        return repo.fetchRoleByName(name);
    }

    @Override
    public List<Long> fetchAllRids() {
        return repo.fetchAllRids();
    }

    @Override
    public void addRole(Role role) {
        repo.save(role);
    }
}
