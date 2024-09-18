package com.vickee.repository;

import com.vickee.model.Tasks;
import java.util.List;

public interface TaskRepo {
    void save(Tasks task);
    List<Tasks> findAll();
    Tasks findById(Long id);
    void delete(Tasks task);
}
