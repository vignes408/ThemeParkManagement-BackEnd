package com.vickee.repository;

import com.vickee.model.Attraction;
import java.util.List;

public interface AttractionRepo {
    void save(Attraction attraction);
    List<Attraction> findAll();
    Attraction findById(Long id);
    void delete(Attraction attraction);
}
