package com.nnrg.recipeapp.controllers;

import com.nnrg.recipeapp.domain.Category;
import com.nnrg.recipeapp.domain.UnitOfMeasure;
import com.nnrg.recipeapp.repositories.CategoryRepository;
import com.nnrg.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("UDM id is: " + unitOfMeasureOptional.get().getId());

        return "index";

    }
}
