package com.example.tacocloud.repository;

import com.example.tacocloud.domain.TacoOrder;
import com.example.tacocloud.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, String> {
    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
