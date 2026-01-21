package collections_practice.gcr_codebase.java_generics.personalizedMealPlanGenerator;

public class MealPlanGenerator {
	public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        if (mealPlan.getCalories() < 1500) {
            throw new IllegalArgumentException("Invalid meal plan: Calories too low!");
        }
        System.out.println("Validated Meal Plan: " + mealPlan.getMealType());
        return new Meal<>(mealPlan);
    } 
}
