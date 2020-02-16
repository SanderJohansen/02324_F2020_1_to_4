package data;

import exception.IngredientNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return id + " \'" + name + "\'" + " (" + amount + " gram)";
        }
    }

    private List<Ingredient> ingredients;

    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "sm�r", 185));
    }

    @Override
    public List<String> getAllIngredients() {
        List<String> ingredientStrings = new ArrayList<>();
        for (Ingredient i : ingredients)
            ingredientStrings.add(i.toString());
        return ingredientStrings;
    }

    @Override
    public String getIngredientName(int id) throws IngredientNotFoundException {
        for (Ingredient i : ingredients)
            if (i.id == id)
                return i.name;
        throw new IngredientNotFoundException();
    }

    @Override
    public int getIngredientAmount(int id) throws IngredientNotFoundException {
        for (Ingredient i : ingredients)
            if (i.id == id)
                return i.amount;
        throw new IngredientNotFoundException();
    }

    @Override
    public void setIngredientName(int id, String name) throws IngredientNotFoundException {
        for (Ingredient i : ingredients)
            if (i.id == id) {
                i.name = name;
                return;
            }
        throw new IngredientNotFoundException();
    }

    @Override
    public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException {
        for (Ingredient i : ingredients)
            if (i.id == id) {
                i.amount = amount;
                return;
            }
        throw new IngredientNotFoundException();
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id, name, amount));
    }
}
