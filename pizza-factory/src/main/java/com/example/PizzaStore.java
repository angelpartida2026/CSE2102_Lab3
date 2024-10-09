package com.example;

public class PizzaStore {
    
    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();

        PizzaInterface myPizza = pf.makePizza("Cheese");
        
        if (myPizza != null) {
            myPizza.prepare();
            myPizza.bake();
            myPizza.cut();
            myPizza.box();
        }
    }
}
