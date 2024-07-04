package com.myco.recipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myco.recipe.model.RecipeItem;


public interface RecipeItemRepository extends JpaRepository<RecipeItem, Integer> {
	  List<RecipeItem> findByNameContaining(String name);
	}
