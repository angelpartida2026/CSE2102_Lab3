package com.example;

public class PizzaFactory {

    public PizzaInterface makePizza(String type) {
        if (null == type || type.isEmpty()) {
            System.err.println("We don't have that pizza");
            return null;
        }

        switch (type) {
            case "Cheese":
                return new CheesePizza();
            case "BBQChicken":
                return new BBQChickenPizza();
            case "Hawaiian":
                return new HawaiianPizza();
            case "MeatLovers":
                return new MeatLoversPizza();
            case "Salad":
                return new SaladPizza();
            default:
                System.out.println("We don't have that pizza");
                return null;
        }
    }
}