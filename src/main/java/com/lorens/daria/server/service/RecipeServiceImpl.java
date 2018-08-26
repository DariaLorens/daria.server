package com.lorens.daria.server.service;

import com.lorens.daria.server.entity.Recipe;
import com.lorens.daria.server.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe getByID(long id) {
        return recipeRepository.findOne(id);
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.saveAndFlush(recipe);
    }

    public void delete(long id) {
        recipeRepository.delete(id);
    }

}
