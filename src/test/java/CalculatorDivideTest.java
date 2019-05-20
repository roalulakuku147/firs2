import org.junit.Assert;
import org.junit.Test;

public class CalculatorDivideTest {
    @Test
    public void thedivisionshouldbecorrect() {
        double result = CalculatorDivide.dividemethod(15.75,5.25);
        Assert.assertEquals(3, result, 0);

    }
}
