package com.mts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.entity.User;
/**
 * 
 * @author ShivshankerMhadiwale
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}