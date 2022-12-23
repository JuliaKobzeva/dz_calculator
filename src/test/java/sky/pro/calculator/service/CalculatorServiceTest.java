package sky.pro.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final Integer ILLEGAL_ARGUMENT = 0;
    private final Integer NUM1 = 1;
    private final Integer NUM2 = 2;
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldNumsEqualsWhenPlus(){
        Integer expected = calculatorService.plus(NUM1,NUM2);
        Integer actual = NUM1 + NUM1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNumsEqualsWhenMinus(){
        Integer expected = calculatorService.minus(NUM1,NUM2);
        Integer actual = NUM1 - NUM1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNumsEqualsWhenMultiply(){
        Integer expected = calculatorService.multiply(NUM1,NUM2);
        Integer actual = NUM1 * NUM1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNumsEqualsWhenDevide(){
        Integer expected = calculatorService.divide(NUM1,NUM2);
        Integer actual = NUM1 / NUM1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDevideOnNull(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(NUM1,ILLEGAL_ARGUMENT));
    }

}
