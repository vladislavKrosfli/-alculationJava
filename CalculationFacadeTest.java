import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;

public class CalculationFacadeTest {
    operatorCalc calc = new operatorCalc();

    @Test
    public void addFTest() throws IOException {
        Assert.assertEquals(27, calc.calculate(13.0,14.0, '+'), 0);
    }

    @Test
    public void subFTest() throws IOException {
        Assert.assertEquals(34, calc.calculate(45.0,11.0, '-'),0);
    }

    @Test
    public void mulFTest() throws IOException {
        Assert.assertEquals(200, calc.calculate(20.0,10.0, '*'),0);
    }

    @Test
    public void divFTest() throws IOException {
        Assert.assertEquals(1.5, calc.calculate(15.0,10.0, '/'),0);
    }
}