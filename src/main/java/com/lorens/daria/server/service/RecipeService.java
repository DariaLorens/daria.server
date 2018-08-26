package com.lorens.daria.server.service;

import com.lorens.daria.server.entity.Recipe;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAll();
    Recipe getByID(long id);
    Recipe save(Recipe recipe);
    void delete(long id);

}
