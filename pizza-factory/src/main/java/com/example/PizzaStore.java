package com.example;

public class PizzaStore {
    
    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();

        PizzaInterface CheesePizza = pf.makePizza("Cheese");
        if (CheesePizza != null) {
            CheesePizza.prepare();
            CheesePizza.bake();
            CheesePizza.cut();
            CheesePizza.box();
            System.out.println();
        }

        PizzaInterface HawaiianPizza = pf.makePizza("Hawaiian");
        if (HawaiianPizza != null) {
            HawaiianPizza.prepare();
            HawaiianPizza.bake();
            HawaiianPizza.cut();
            HawaiianPizza.box();
            System.out.println();
        }

        PizzaInterface BBQChickenPizza = pf.makePizza("BBQChicken");
        if (BBQChickenPizza != null) {
            BBQChickenPizza.prepare();
            BBQChickenPizza.bake();
            BBQChickenPizza.cut();
            BBQChickenPizza.box();
            System.out.println();
        }

        PizzaInterface MeatLoversPizza = pf.makePizza("MeatLovers");
        if (MeatLoversPizza != null) {
            MeatLoversPizza.prepare();
            MeatLoversPizza.bake();
            MeatLoversPizza.cut();
            MeatLoversPizza.box();
            System.out.println();
        }

        PizzaInterface SaladPizza = pf.makePizza("Salad");
        if (SaladPizza != null) {
            SaladPizza.prepare();
            SaladPizza.bake();
            SaladPizza.cut();
            SaladPizza.box();
            System.out.println();
        }
    }
}
