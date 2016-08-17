package com.example.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.master.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByName(String name);
}
