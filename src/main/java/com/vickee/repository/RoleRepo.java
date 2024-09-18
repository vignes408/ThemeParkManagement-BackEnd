//package com.vickee.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.vickee.model.Role;
//
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public interface RoleRepo extends JpaRepository<Role, Long>{
//	
//	@Query(value="select personname from role_tbl", nativeQuery = true)
//	List<String> fetchAllNames();
//	
//	@Query(value = "from role_tbl where personname = :name", nativeQuery = true)
//	public Role fetchRoleByName(String name);
//	
//	@Query(value="select roleid from role_tbl", nativeQuery = true)
//	List<Long> fetchAllRids();
//	
//}

package com.vickee.repository;

import com.vickee.model.Role;
import java.util.List;

public interface RoleRepo {
    void save(Role role);
    List<String> fetchAllNames();
    List<Role> findAll();
    Role fetchRoleByName(String name);
    List<Long> fetchAllRids();
    Role findById(Long id);
    void delete(Role role);
}
