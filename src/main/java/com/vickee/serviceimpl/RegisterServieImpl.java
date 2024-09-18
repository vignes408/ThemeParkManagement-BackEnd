package com.vickee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.model.Register;
import com.vickee.repository.RegisterRepo;
import com.vickee.service.RegisterService;

@Service
public class RegisterServieImpl implements RegisterService {

    @Autowired
    RegisterRepo repo;

    @Override
    public String addRegister(Register register) {
        if (register != null) {
            repo.save(register);
            return "success";
        } else {
            return "failure";
        }
    }

    @Override
    public Register login(Register register) {
        return repo.findByName(register.getEmail(), register.getPassword());
    }

    @Override
    public Register getRegisterById(Long regid) {
        return repo.findById(regid);
    }
}
