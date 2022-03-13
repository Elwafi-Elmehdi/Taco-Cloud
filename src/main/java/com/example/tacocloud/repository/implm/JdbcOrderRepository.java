package com.example.tacocloud.repository.implm;

import com.example.tacocloud.domain.TacoOrder;
import com.example.tacocloud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcOrderRepository implements OrderRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public TacoOrder save(TacoOrder tacoOrder) {
        return null;
    }
}
