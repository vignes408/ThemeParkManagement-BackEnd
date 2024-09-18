//package com.vickee.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.vickee.model.Ride;
//
//@Repository
//public interface RideRepo extends JpaRepository<Ride, Long>{
//
//}

package com.vickee.repository;
import java.util.List;
import com.vickee.model.Ride;

public interface RideRepo {
    void save(Ride ride);
    Ride findById(Long id);
    List<Ride> findAll();
}
