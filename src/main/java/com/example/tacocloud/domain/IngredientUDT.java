package com.example.tacocloud.domain;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("ingredients")
public class IngredientUDT {
    private final String name;
    private final Ingredient.Type type;

    public IngredientUDT(String name, Ingredient.Type type) {
        this.name = name;
        this.type = type;
    }
}