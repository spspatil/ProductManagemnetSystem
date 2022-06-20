package com.BikkadIt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
