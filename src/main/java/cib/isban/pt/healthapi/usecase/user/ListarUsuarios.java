package cib.isban.pt.healthapi.usecase.user;

import java.util.List;

import cib.isban.pt.healthapi.dataprovider.h2.model.User;

public interface ListarUsuarios {
    List<User> getUsers();
}
