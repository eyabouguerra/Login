package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.user;

@Repository
public interface UserRepo extends JpaRepository<user, String>{

}