package com.vickee.repository;

import com.vickee.model.Events;
import java.util.List;

public interface EventRepo {
    void save(Events events);
    List<Events> findAll();
    Events findById(Long id);
    void delete(Events events);
}
