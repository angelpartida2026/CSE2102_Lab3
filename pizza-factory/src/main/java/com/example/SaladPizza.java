package com.example;

public class SaladPizza implements PizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing a salad pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a salad pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a salad pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a salad pizza");
    }
}
