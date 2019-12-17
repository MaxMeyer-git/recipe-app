package com.nnrg.recipeapp.controllers;

import com.nnrg.recipeapp.Services.RecipeService;
import com.nnrg.recipeapp.domain.Category;
import com.nnrg.recipeapp.domain.UnitOfMeasure;
import com.nnrg.recipeapp.repositories.CategoryRepository;
import com.nnrg.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";

    }
}
