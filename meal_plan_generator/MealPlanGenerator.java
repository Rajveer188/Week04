package com.tit.week04.day01.generics.meal_plan_generator;

import static java.lang.System.out;

public class MealPlanGenerator{
    public static void main(String[] args) {
        //plan keto meal
        KetoMeal eggMeal = new KetoMeal("Boiled agg");
        Meal<KetoMeal> ketoMeal = new Meal<>(eggMeal);

        //plan vegetarian meal
        VegetarianMeal paneerMeal = new VegetarianMeal("Paneer");
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(paneerMeal);

        //plan vegan meal
        VeganMeal coconutMeal = new VeganMeal("Coconut Rice Bowls");
        Meal<VeganMeal> veganMeal = new Meal<>(coconutMeal);

        //plan high protein meal
        HighProteinMeal chickenMeal = new HighProteinMeal("Chicken");
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(chickenMeal);

        //display meal details
        out.println(ketoMeal.getMeal() +
                "\n" +veganMeal.getMeal() +
                "\n" +vegetarianMeal.getMeal() +
                "\n" +highProteinMeal.getMeal());
    }
}
