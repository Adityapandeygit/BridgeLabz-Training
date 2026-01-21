package collections_practice.gcr_codebase.java_generics.personalizedMealPlanGenerator;

public class Main {
	public static void main(String[] args) {
		Meal<VegetarianMeal> vegMeal =
                MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        vegMeal.displayMeal();
        
        System.out.println();
        
	}
}
