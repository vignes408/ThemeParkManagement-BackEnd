package com.vickee.repoimpl;

import com.vickee.model.Tasks;
import com.vickee.repository.TaskRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class TaskRepoImpl implements TaskRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Tasks task) {
        entityManager.merge(task);
    }

    @Override
    public List<Tasks> findAll() {
        return entityManager.createQuery("FROM Tasks", Tasks.class).getResultList();
    }

    @Override
    public Tasks findById(Long id) {
        return entityManager.find(Tasks.class, id);
    }

    @Override
    public void delete(Tasks task) {
        entityManager.remove(entityManager.contains(task) ? task : entityManager.merge(task));
    }
}
