package com.vickee.repoimpl;

import com.vickee.model.Role;
import com.vickee.repository.RoleRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class RoleRepoImpl implements RoleRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Role role) {
        entityManager.merge(role);
    }

    @Override
    public List<String> fetchAllNames() {
        return entityManager.createNativeQuery("SELECT personname FROM role_tbl").getResultList();
    }

    @Override
    public List<Role> findAll() {
        return entityManager.createQuery("FROM Role", Role.class).getResultList();
    }

    @Override
    public Role fetchRoleByName(String name) {
        return entityManager.createQuery("FROM Role WHERE personname = :name", Role.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public List<Long> fetchAllRids() {
        return entityManager.createNativeQuery("SELECT roleid FROM role_tbl").getResultList();
    }

    @Override
    public Role findById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public void delete(Role role) {
        entityManager.remove(entityManager.contains(role) ? role : entityManager.merge(role));
    }
}
