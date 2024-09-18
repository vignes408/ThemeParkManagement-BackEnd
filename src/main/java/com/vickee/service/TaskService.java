package com.vickee.service;
import java.util.List;

import com.vickee.model.Tasks;

public interface TaskService {
	
	public String addTasks(Tasks task);
	public List<Tasks> getAllTasks();
}
