package com.tit.week04.day01.generics.meal_plan_generator;

public class VegetarianMeal implements MealPlan{
    //Attribute
    private String mealName;

    //constructor
    public VegetarianMeal(String mealName){
        this.mealName = mealName;
    }
    @Override
    public String getMealType() {
        return "Vegetarian";
    }
    @Override
    public String toString() {
        String mealDetails =  "meal name - "+ mealName + ", type - " + getMealType();
        return mealDetails;
    }
}
