package com.tit.week04.day01.generics.meal_plan_generator;

public class HighProteinMeal implements MealPlan{
    //Attribute
    private String mealName;

    //constructor
    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }
    @Override
    public String getMealType() {
        return "High-Protein";
    }
    @Override
    public String toString() {
        String mealDetails =  "meal name - "+ mealName + ", type - " + getMealType();
        return mealDetails;
    }
}
