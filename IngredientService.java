import java.util.ArrayList;


public interface IngredientService {


    int addIngredient(Ingredient ingredient);


    Ingredient getIngredient(int id);

    ArrayList<Ingredient> getAllIngredient();

    Ingredient editIngredient(int id, Ingredient ingredient);

    boolean deleteIngredient(int id);
}