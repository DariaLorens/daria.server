package com.lorens.daria.server.controller;

import com.lorens.daria.server.entity.Recipe;
import com.lorens.daria.server.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipesController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    @ResponseBody
    public List<Recipe> getAllRecipes(){
        return recipeService.getAll();
    }

    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Recipe getRecipe(@PathVariable("id") long recipId){
        return recipeService.getByID(recipId);
    }

    @RequestMapping(value = "/recipes", method = RequestMethod.POST)
    @ResponseBody
    public Recipe saveRecipe(@RequestBody Recipe recipe){
        return recipeService.save(recipe);
    }

    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRecipe(@PathVariable("id") long recipId){
        recipeService.delete(recipId);
    }
}
