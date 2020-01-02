package com.nnrg.recipeapp.services;

import com.nnrg.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);


}
