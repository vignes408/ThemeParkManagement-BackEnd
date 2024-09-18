package com.vickee.repoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.vickee.model.Booking;
import com.vickee.repository.BookingRepo;

@Repository
@jakarta.transaction.Transactional
public class BookingRepoImpl implements BookingRepo {

    @jakarta.persistence.PersistenceContext
    private jakarta.persistence.EntityManager entityManager;

    @Override
    public void save(Booking booking) {
        entityManager.persist(booking);
    }

    @Override
    public Booking findById(Long id) {
        return entityManager.find(Booking.class, id);
    }

    @Override
    public List<Booking> findByRegid(String regid) {
        return entityManager.createQuery("FROM Booking WHERE regid = :regid", Booking.class)
                            .setParameter("regid", regid)
                            .getResultList();
    }

    @Override
    public List<Booking> findAll() {
        return entityManager.createQuery("FROM Booking", Booking.class).getResultList();
    }
}
