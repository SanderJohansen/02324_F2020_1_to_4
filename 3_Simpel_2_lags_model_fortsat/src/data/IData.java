package data;

import exception.IngredientNotFoundException;

import java.util.List;

public interface IData {
    List<String> getAllIngredients(); //returnerer alle ingredienser i String-format
    String getIngredientName(int id) throws IngredientNotFoundException; //returnerer navn for ingrediens
    int getIngredientAmount(int id) throws IngredientNotFoundException; //returnerer mængde for ingrediens
    void setIngredientName(int id, String name) throws IngredientNotFoundException; //Ændrer navn for ingrediens til angivet værdi i 'name'
    void setIngredientAmount(int id, int amount) throws IngredientNotFoundException; //Ændrer mængde for ingrediens til angivet værdi i 'amount'
    void createIngredient(int id, String name, int amount); //opretter en ny ingrediens med de angivne værdier
}
