import java.util.ArrayList;

public interface RecipeService {

    int addRecipe(Recipe ingredient);

    Recipe getRecipe(int id);

    ArrayList<Recipe> getAllRecipe();

    Recipe editRecipe(int id, Recipe recipe);

    boolean deleteRecipe(int id);

    ArrayList<Recipe> getRecipeByIngredient(int indredientId);

    ArrayList<Recipe> getRecipeByIngredientList(ArrayList<String> ingredients);
}