package com.vickee.repoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.vickee.model.Ride;
import com.vickee.repository.RideRepo;

@Repository
@jakarta.transaction.Transactional
public class RideRepoImpl implements RideRepo {

    @jakarta.persistence.PersistenceContext
    private jakarta.persistence.EntityManager entityManager;

    @Override
    public void save(Ride ride) {
        entityManager.persist(ride);
    }

    @Override
    public Ride findById(Long id) {
        return entityManager.find(Ride.class, id);
    }

    @Override
    public List<Ride> findAll() {
        return entityManager.createQuery("FROM Ride", Ride.class).getResultList();
    }
}
