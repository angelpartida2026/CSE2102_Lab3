package com.example;

public class BBQChickenPizza implements PizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing a BBQ Chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a BBQ Chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a BBQ Chicken pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a BBQ Chicken pizza");
    }
}
