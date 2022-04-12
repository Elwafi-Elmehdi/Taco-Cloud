package com.example.tacocloud.repository;

import com.example.tacocloud.domain.Ingredient;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, UUID> {
}
