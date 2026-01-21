package collections_practice.gcr_codebase.java_generics.personalizedMealPlanGenerator;

public class Meal<T extends MealPlan> {
	private T mealPlan;
	public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
	public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Calories: " + mealPlan.getCalories());
    }
}
