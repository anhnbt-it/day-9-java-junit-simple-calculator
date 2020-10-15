import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/15/2020
 * Time: 10:03 AM
 */
public class SimpleCalculatorTest {

    @Test
    @DisplayName("0 + 0 = 0")
    void addition0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int actual = SimpleCalculator.add(first, second);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("0 + 1 = 1")
    void addition0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;
        int actual = SimpleCalculator.add(first, second);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5 + 3 = 8")
    void addition5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;
        int actual = SimpleCalculator.add(first, second);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5 - 4 = 1")
    void subtraction5And4() {
        int first = 5;
        int second = 4;
        int expected = 1;
        int actual = SimpleCalculator.sub(first, second);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("50 - 3 = 47")
    void subtraction50And3() {
        int first = 50;
        int second = 3;
        int expected = 47;
        int actual = SimpleCalculator.sub(first, second);

        assertEquals(expected, actual);
    }
}
