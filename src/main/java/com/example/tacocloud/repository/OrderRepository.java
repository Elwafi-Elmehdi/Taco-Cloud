package com.example.tacocloud.repository;

import com.example.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, String> {
}
