package com.learningtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningtech.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
