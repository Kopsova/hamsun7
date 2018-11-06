import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getApple() {
        Apple fruit = new Apple();
        assertEquals("orange", fruit.getApple());
    }
}