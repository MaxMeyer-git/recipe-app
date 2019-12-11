package com.nnrg.recipeapp.repositories;

import com.nnrg.recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

//    Optional<UnitOfMeasure> findByDescription(String description);
    Optional<UnitOfMeasure> findByDescription (String description);
}
