package com.example.tacocloud.repository;

import com.example.tacocloud.domain.TacoOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<TacoOrder,Long> {
}
