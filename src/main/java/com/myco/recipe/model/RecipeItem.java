package com.myco.recipe.model;

import com.myco.recipe.enums.UnitOfMeasure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
public class RecipeItem {
	
	@Id 
	@GeneratedValue
	private int id;
	private String name;
	private UnitOfMeasure unit;
	private double quantity;
	private double price;
	
}
