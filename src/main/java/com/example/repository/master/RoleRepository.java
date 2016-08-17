package com.example.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.master.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findOneByName(String name);
}
