package com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.user;


@Repository
public interface Login extends JpaRepository<user, String>{

}