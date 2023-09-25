package com.nagesh.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagesh.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
