package com.example.customerservice.repository;

import com.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface CustomerReposotory extends JpaRepository<Customer, Long> {
}
