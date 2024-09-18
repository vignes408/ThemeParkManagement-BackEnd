package com.vickee.repoimpl;

import com.vickee.model.Register;
import com.vickee.repository.RegisterRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class RegisterRepoImpl implements RegisterRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Register register) {
        entityManager.merge(register);
    }

    @Override
    public List<Register> findAll() {
        return entityManager.createQuery("from Register", Register.class).getResultList();
    }

    @Override
    public Register findById(Long id) {
        return entityManager.find(Register.class, id);
    }

    @Override
    public Register findByName(String email, String password) {
        return entityManager.createQuery("from Register where email = :email and password = :password", Register.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
    }

    @Override
    public void delete(Register register) {
        entityManager.remove(entityManager.contains(register) ? register : entityManager.merge(register));
    }
}
