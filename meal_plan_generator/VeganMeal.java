package com.tit.week04.day01.generics.meal_plan_generator;

public class VeganMeal implements MealPlan{
    //Attribute
    private String mealName;

    //constructor
    public VeganMeal(String mealName){
        this.mealName = mealName;
    }
    @Override
    public String getMealType() {
        return "Vegan";
    }
    @Override
    public String toString() {
        String mealDetails =  "meal name - "+ mealName + ", type - " + getMealType();
        return mealDetails;
    }
}
