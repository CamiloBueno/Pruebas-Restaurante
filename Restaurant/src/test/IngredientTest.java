package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Ingredient;

class IngredientTest {
	
	private Ingredient ingredient;
	
	public void setUpStage1() {
		
		 ingredient = new Ingredient("tomate", 245);
		
	}
	@Test
	public void testAddWeight() {
		
		setUpStage1();
		
		int additionalW = 54;
		
		ingredient.addWeight(additionalW);
		
		assertTrue("La adicion que se realizo al ingrediente es incorrecta", 299 == ingredient.getWeight());
	}
	
	
	
}
