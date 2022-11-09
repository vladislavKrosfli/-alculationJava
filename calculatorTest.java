import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    Calculation calc = new Calculation();

    @Test
    public void addTest(){
        Assert.assertEquals(25, Calculation.add(15.0,10.0),0);
    }

    @Test
    public void subTest(){
        Assert.assertEquals(5, Calculation.sub(15.0,10.0),0);
    }

    @Test
    public void mulTest(){
        Assert.assertEquals(150, Calculation.mul(15.0,10.0),0);
    }

    @Test
    public void divTest(){
        Assert.assertEquals(1.5, Calculation.div(15.0,10.0),0);
    }
}