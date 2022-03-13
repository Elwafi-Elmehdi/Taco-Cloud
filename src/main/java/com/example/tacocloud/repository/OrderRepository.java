package com.example.tacocloud.repository;

import com.example.tacocloud.domain.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder );
}
