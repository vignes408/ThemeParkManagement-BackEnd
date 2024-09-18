package com.vickee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Maintainence;
import com.vickee.repository.MaintainenceRepo;
import com.vickee.service.MaintainenceService;

@Service
public class MaintainenceServiceImpl implements MaintainenceService {

    @Autowired
    MaintainenceRepo repo;

    @Override
    public void addMaintainence(Maintainence maintain) {
        repo.save(maintain);
    }

    @Override
    public List<Maintainence> getAllMaintence() {
        return repo.findAll();
    }
}
