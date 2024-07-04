package com.myco.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myco.recipe.model.RecipeItem;
import com.myco.recipe.service.RecipeItemService;

@RestController
@RequestMapping("/api/v1")
public class RecipeItemController {
	
	@Autowired
	RecipeItemService recipeItemService;
	
	@GetMapping("/recipeitem/{id}")
	public RecipeItem getRecipeItemById(@PathVariable("id") int id) {
		return recipeItemService.getRecipeItemtById(id);
	}
	
	@GetMapping("/recipeitem/{name}")
	public List<RecipeItem> getRecipeItemByName(@PathVariable("name") String name) {
		return recipeItemService.getRecipeItemByName(name);
	}
	
	 @PutMapping("/update")
	 public RecipeItem updateProduct(@RequestBody RecipeItem recipeItem) {
	     return recipeItemService.updateRecipeItem(recipeItem);
	 }

	 @DeleteMapping("/delete/{id}")
	 public String deleteProduct(@PathVariable int id) {
	     return recipeItemService.deleteRecipeItem(id);
	 }

}
