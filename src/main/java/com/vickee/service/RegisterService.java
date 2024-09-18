package com.vickee.service;

import com.vickee.model.Register;

public interface RegisterService {
	
	public String addRegister(Register register);
	Register login(Register register);
	Register getRegisterById(Long regid);
}
