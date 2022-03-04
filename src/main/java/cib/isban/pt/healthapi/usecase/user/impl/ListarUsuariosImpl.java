package cib.isban.pt.healthapi.usecase.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cib.isban.pt.healthapi.dataprovider.h2.model.User;
import cib.isban.pt.healthapi.dataprovider.h2.repository.UserRepository;
import cib.isban.pt.healthapi.usecase.user.ListarUsuarios;

@Service
public class ListarUsuariosImpl implements ListarUsuarios {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
       
        return userRepository.findAll();
    }
    
}
