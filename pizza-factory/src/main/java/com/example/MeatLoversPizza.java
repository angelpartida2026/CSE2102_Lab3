package com.example;

public class MeatLoversPizza implements PizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing a Meat Lovers pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking a Meat Lovers pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a Meat Lovers pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a Meat Lovers pizza");
    }
}
