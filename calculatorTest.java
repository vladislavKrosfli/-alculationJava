import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    calculator calc = new calculator();

    @Test
    public void addTest(){
        Assert.assertEquals(25,calculator.add(15.0,10.0),0);
    }

    @Test
    public void subTest(){
        Assert.assertEquals(5,calculator.sub(15.0,10.0),0);
    }

    @Test
    public void mulTest(){
        Assert.assertEquals(150,calculator.mul(15.0,10.0),0);
    }

    @Test
    public void divTest(){
        Assert.assertEquals(1.5,calculator.div(15.0,10.0),0);
    }
}