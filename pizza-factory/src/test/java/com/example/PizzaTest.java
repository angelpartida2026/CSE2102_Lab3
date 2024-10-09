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
}
