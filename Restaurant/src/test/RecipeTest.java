package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Ingredient;
import model.Recipe;

class RecipeTest {

	Recipe recipe;
	  
	
	@Test
	public void testAddIngredient() {
		
		setUpStage1();
		
		recipe.addIngredient("sal", 12);
		
		
		assertTrue("el ingrediente no se agrego a la receta", 1==recipe.getIngredients().size());
		
		assertTrue("no existe un ingrediente con dicho nombre", "sal".equals(recipe.getIngredients().get(0).getName()));
		assertTrue("no existe un ingrediente con dicho peso", 12 == recipe.getIngredients().get(0).getWeight());
		
		setUpStage2();
		
		recipe.addIngredient("pimienta", 6);
		
		assertTrue("el ingrediente no se agrego a la receta", 4==recipe.getIngredients().size());
		
		assertTrue("no existe un ingrediente con dicho nombre", "pimienta".equals(recipe.getIngredients().get(3).getName()));
		assertTrue("no existe un ingrediente con dicho peso", 6 == recipe.getIngredients().get(3).getWeight());
		
		setUpStage2();
		
		recipe.addIngredient("ajo", 21);
		
		assertTrue("se actualiza un ingrediente", 3==recipe.getIngredients().size());
		
		assertTrue("No se actualiza el weight", 79 == recipe.getIngredients().get(1).getWeight());
		
	}
	
	public void setUpStage1() {
		
		 recipe = new Recipe();
		
	}
	
	public void setUpStage2() {
		
		 recipe = new Recipe();
		 
		 recipe.addIngredient("cebolla", 315);
		 recipe.addIngredient("ajo", 58);
		 recipe.addIngredient("arroz",520);
		
	}
	

	

}
