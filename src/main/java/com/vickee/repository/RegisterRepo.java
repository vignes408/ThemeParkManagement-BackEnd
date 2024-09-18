package com.vickee.repository;

import com.vickee.model.Register;
import java.util.List;

public interface RegisterRepo {
    void save(Register register);
    List<Register> findAll();
    Register findById(Long id);
    Register findByName(String email, String password);
    void delete(Register register);
}

