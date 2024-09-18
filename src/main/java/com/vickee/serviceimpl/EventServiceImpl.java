package com.vickee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Events;
import com.vickee.repository.EventRepo;
import com.vickee.service.EventService;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepo repo;

    @Override
    public void addEvents(Events events) {
        repo.save(events);
    }

    @Override
    public List<Events> getAllEvents() {
        return repo.findAll();
    }
}
