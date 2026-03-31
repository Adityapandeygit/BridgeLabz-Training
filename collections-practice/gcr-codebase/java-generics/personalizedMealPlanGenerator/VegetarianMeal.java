package collections_practice.gcr_codebase.java_generics.personalizedMealPlanGenerator;

public class VegetarianMeal implements MealPlan{
	public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 1800;
    }
}
