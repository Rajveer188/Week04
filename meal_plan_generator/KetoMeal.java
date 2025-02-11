package com.tit.week04.day01.generics.meal_plan_generator;

public class KetoMeal implements MealPlan{
    //Attribute
    private String mealName;

    //constructor
    public KetoMeal(String mealName){
        this.mealName = mealName;
    }
    @Override
    public String getMealType() {
        return "Keto";
    }
    @Override
    public String toString() {
        String mealDetails =  "meal name - "+ mealName + ", type - " + getMealType();
        return mealDetails;
    }
}
