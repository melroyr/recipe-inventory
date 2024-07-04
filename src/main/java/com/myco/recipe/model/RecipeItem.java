package com.myco.recipe.model;

import com.myco.recipe.enums.UnitOfMeasure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class RecipeItem {
	
	@Id 
	@GeneratedValue
	private int id;
	private String name;
	private UnitOfMeasure unit;
	private double value;
	private double cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UnitOfMeasure getUnit() {
		return unit;
	}
	public void setUnit(UnitOfMeasure unit) {
		this.unit = unit;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	
}
