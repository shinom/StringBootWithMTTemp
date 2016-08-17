package com.example.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.master.Company;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findOneByName(String name);
    Optional<Company> findOneByCompanyKey(String companyKey);
}
