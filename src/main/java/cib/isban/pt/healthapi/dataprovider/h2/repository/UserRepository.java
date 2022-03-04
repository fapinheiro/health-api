package cib.isban.pt.healthapi.dataprovider.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cib.isban.pt.healthapi.dataprovider.h2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
