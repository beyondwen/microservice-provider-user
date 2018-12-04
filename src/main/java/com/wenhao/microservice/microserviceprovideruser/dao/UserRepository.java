package com.wenhao.microservice.microserviceprovideruser.dao;

import com.wenhao.microservice.microserviceprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
