package com.vickee.repoimpl;

import com.vickee.model.Attraction;
import com.vickee.repository.AttractionRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public class AttractionRepoImpl implements AttractionRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Attraction attraction) {
        entityManager.merge(attraction);
    }

    @Override
    public List<Attraction> findAll() {
        return entityManager.createQuery("FROM Attraction", Attraction.class).getResultList();
    }

    @Override
    public Attraction findById(Long id) {
        return entityManager.find(Attraction.class, id);
    }

    @Override
    public void delete(Attraction attraction) {
        entityManager.remove(entityManager.contains(attraction) ? attraction : entityManager.merge(attraction));
    }
}
