import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAdapterTest {
    CalculatorAdapter calc = new CalculatorAdapter();
    @Test
    public void addTest() {
        Assert.assertEquals(25, calc.operation(15.0,10.0, '+'),0);
    }

    @Test
    public void subTest() {
        Assert.assertEquals(100, calc.operation(111.0,11.0, '-'),0);
    }

    @Test
    public void mulTest() {
        Assert.assertEquals(23, calc.operation(2.3,10.0, '*'),0);
    }

    @Test
    public void divTest() {
        Assert.assertEquals(17, calc.operation(34.0,2.0, '/'),0);
    }
}