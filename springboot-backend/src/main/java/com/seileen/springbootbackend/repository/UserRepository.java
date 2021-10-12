package com.seileen.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seileen.springbootbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
