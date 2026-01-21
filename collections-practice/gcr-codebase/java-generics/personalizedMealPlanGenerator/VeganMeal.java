package collections_practice.gcr_codebase.java_generics.personalizedMealPlanGenerator;

public class VeganMeal implements MealPlan{
	public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1700;
    }
}
