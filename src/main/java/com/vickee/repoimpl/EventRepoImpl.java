package com.vickee.repoimpl;

import com.vickee.model.Events;
import com.vickee.repository.EventRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class EventRepoImpl implements EventRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Events events) {
        entityManager.merge(events);
    }

    @Override
    public List<Events> findAll() {
        return entityManager.createQuery("FROM Events", Events.class).getResultList();
    }

    @Override
    public Events findById(Long id) {
        return entityManager.find(Events.class, id);
    }

    @Override
    public void delete(Events events) {
        entityManager.remove(entityManager.contains(events) ? events : entityManager.merge(events));
    }
}
