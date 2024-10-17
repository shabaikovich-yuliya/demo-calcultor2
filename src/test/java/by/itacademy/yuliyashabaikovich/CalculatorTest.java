package by.itacademy.yuliyashabaikovich;

import by.itacademy.yuliyashabaikovich.calculator2.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test() {
        Calculator calc1 = new Calculator();
        double actual = calc1.sum(1.1, 2.3);
        Assertions.assertEquals(3.4, actual);
    }
}
