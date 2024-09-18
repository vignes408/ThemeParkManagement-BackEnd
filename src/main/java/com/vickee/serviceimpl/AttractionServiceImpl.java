package com.vickee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Attraction;
import com.vickee.repository.AttractionRepo;
import com.vickee.service.AttractionService;

@Service
public class AttractionServiceImpl implements AttractionService {

    @Autowired
    AttractionRepo repo;

    @Override
    public void addAttract(Attraction attract) {
        repo.save(attract);
    }
}
