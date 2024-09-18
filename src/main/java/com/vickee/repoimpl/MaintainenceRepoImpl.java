package com.vickee.repoimpl;

import com.vickee.model.Maintainence;
import com.vickee.repository.MaintainenceRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class MaintainenceRepoImpl implements MaintainenceRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Maintainence maintain) {
        entityManager.merge(maintain);
    }

    @Override
    public List<Maintainence> findAll() {
        return entityManager.createQuery("FROM Maintainence", Maintainence.class).getResultList();
    }

    @Override
    public Maintainence findById(Long id) {
        return entityManager.find(Maintainence.class, id);
    }

    @Override
    public void delete(Maintainence maintain) {
        entityManager.remove(entityManager.contains(maintain) ? maintain : entityManager.merge(maintain));
    }
}
