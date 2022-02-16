package com.vestcasamoro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vestcasamoro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
