package com.tit.week04.day01.generics.meal_plan_generator;

public class Meal <T extends MealPlan>{
    //attribute
    private T meal;

    //Constructor
    public Meal(T meal){
        this.meal = meal;
    }
    //method to get meal
    public T getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return meal.toString();
    }
}
