package com.vickee.repoimpl;

import com.vickee.model.Payment;
import com.vickee.repository.PaymentRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@jakarta.transaction.Transactional
public class PaymentRepoImpl implements PaymentRepo {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("deprecation")
	@Override
    public void save(Payment payment) {
        getCurrentSession().saveOrUpdate(payment);
    }

    @Override
    public List<Payment> findAll() {
        return getCurrentSession().createQuery("from Payment", Payment.class).list();
    }

    @Override
    public Payment findById(Long id) {
        return getCurrentSession().get(Payment.class, id);
    }

    @SuppressWarnings("deprecation")
	@Override
    public void delete(Payment payment) {
        getCurrentSession().delete(payment);
    }
}
