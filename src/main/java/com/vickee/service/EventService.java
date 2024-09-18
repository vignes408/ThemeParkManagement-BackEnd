package com.vickee.service;

import java.util.List;

import com.vickee.model.Events;

public interface EventService {
	
	public void addEvents(Events events);
	public List<Events> getAllEvents();
}
