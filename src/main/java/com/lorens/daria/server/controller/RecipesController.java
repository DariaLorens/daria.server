package com.lorens.daria.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/recipes")
public class RecipesController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public @ResponseBody String getRecipes(ModelMap model ){
        return "My Recipes";
    }

}
