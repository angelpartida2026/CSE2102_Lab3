package com.example;

public class HawaiianPizza implements PizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing a Hawaiian pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a Hawaiian pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a Hawaiian pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a Hawaiian pizza");
    }
}
