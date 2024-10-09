import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void testCheesePizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface pizza = pf.makePizza("Cheese");
        assertNotNull(pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testBBQChickenPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface pizza = pf.makePizza("BBQChicken");
        assertNotNull(pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testHawaiianPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface pizza = pf.makePizza("Hawaiian");
        assertNotNull(pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testMeatLoversPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface pizza = pf.makePizza("MeatLovers");
        assertNotNull(pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    @Test
    public void testSaladPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface pizza = pf.makePizza("Salad");
        assertNotNull(pizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
