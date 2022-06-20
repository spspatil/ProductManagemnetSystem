package com.BikkadIt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.model.OrderManagement;

public interface OrderRepository extends JpaRepository<OrderManagement, Integer>{

}
