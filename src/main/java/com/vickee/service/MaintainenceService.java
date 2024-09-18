package com.vickee.service;

import java.util.List;

import com.vickee.model.Maintainence;

public interface MaintainenceService {
	
	public void addMaintainence(Maintainence maintain);
	public List<Maintainence> getAllMaintence();
}
