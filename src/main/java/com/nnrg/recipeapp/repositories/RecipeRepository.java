package com.nnrg.recipeapp.repositories;

import com.nnrg.recipeapp.domain.Category;
import com.nnrg.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findByDescription(String description);

}
