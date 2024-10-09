package com.example;

public class PizzaFactory {

    public PizzaInterface makePizza(String type) {
        if (null == type || type.isEmpty()) {
            System.err.println("No such pizza type");
            return null;
        }

        switch (type) {
            case "Cheese":
                return new CheesePizza();
            default:
                System.out.println("No such pizza type");
                return null;
        }
    }
}