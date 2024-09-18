//package com.vickee.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.vickee.model.Payment;
//
//
//@Repository
//public interface PaymentRepo extends JpaRepository<Payment, Long> {
//
//}


package com.vickee.repository;

import com.vickee.model.Payment;
import java.util.List;

public interface PaymentRepo {
    void save(Payment payment);
    List<Payment> findAll();
    Payment findById(Long id);
    void delete(Payment payment);
}
