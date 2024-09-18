package com.vickee.repository;

import com.vickee.model.Maintainence;
import java.util.List;

public interface MaintainenceRepo {
    void save(Maintainence maintain);
    List<Maintainence> findAll();
    Maintainence findById(Long id);
    void delete(Maintainence maintain);
}
