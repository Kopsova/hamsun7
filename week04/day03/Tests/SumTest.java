import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sum() {
        ArrayList numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        Sum sum = new Sum();
        assertEquals(18, sum.sum(numbers));
    }
}