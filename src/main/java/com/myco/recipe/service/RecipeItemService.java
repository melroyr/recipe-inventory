package com.myco.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.javatechie.crud.example.entity.Product;
import com.myco.recipe.model.RecipeItem;
import com.myco.recipe.repository.RecipeItemRepository;

@Service
public class RecipeItemService {
    @Autowired
    private RecipeItemRepository repository;
    
    public RecipeItem getRecipeItemtById(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public List<RecipeItem> getRecipeItemByName(String name) {
        return repository.findByNameContaining(name);
    }
    
    public RecipeItem saveRecipeItem(RecipeItem recipeItem) {
        return repository.save(recipeItem);
    }
    
    public List<RecipeItem> saveRecipeItems(List<RecipeItem> recipeItems) {
        return repository.saveAll(recipeItems);
    }
    
    public RecipeItem updateRecipeItem(RecipeItem recipeItem) {
        RecipeItem existingRecipeItem = repository.findById(recipeItem.getId()).orElse(null);
        existingRecipeItem.setName(recipeItem.getName());
        existingRecipeItem.setQuantity(recipeItem.getQuantity());
        existingRecipeItem.setPrice(recipeItem.getPrice());
        return repository.save(existingRecipeItem);
    }
    
    public String deleteRecipeItem(int id) {
        repository.deleteById(id);
        return "Recipe Item removed !! " + id;
    }
}
