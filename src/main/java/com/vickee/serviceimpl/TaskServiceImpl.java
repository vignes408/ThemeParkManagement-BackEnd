package com.vickee.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Tasks;
import com.vickee.repository.TaskRepo;
import com.vickee.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepo repo;

    @Override
    public String addTasks(Tasks task) {
        if (task != null) {
            repo.save(task);
            return "Success";
        } else {
            return "Failure";
        }
    }

    @Override
    public List<Tasks> getAllTasks() {
        return repo.findAll();
    }
}
