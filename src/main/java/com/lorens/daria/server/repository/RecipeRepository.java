package com.lorens.daria.server.repository;

import com.lorens.daria.server.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
