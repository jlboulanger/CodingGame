import org.junit.Assert;
import org.junit.Test;

public class MiscTest {
    @Test
    public void testClosestZero() {
        int[] ints = {-10, 15, -2, -15, -5, 48, -50, 0};
        Assert.assertEquals(0, MiscExo.closestZero(ints));
    }
}
