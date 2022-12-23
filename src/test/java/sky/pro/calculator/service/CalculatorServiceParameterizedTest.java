package sky.pro.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    private CalculatorService calculatorService;
    private static final Integer NUM1 = 1;
    private static final Integer NUM2 = 2;

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldNumsEqualsWhenPlus2(Integer integer1, Integer integer2){
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.plus(integer1,integer2), integer1+integer2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldNumsEqualsWhenMinus2(Integer integer1, Integer integer2){
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.minus(integer1,integer2), integer1-integer2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldNumsEqualsWhenMultiply2(Integer integer1, Integer integer2){
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiply(integer1,integer2), integer1*integer2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldNumsEqualsWhenDivide2(Integer integer1, Integer integer2){
        calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.divide(integer1,integer2), integer1/integer2);
    }

    public static Stream<Arguments> provideParamsForTest(){
        return Stream.of(Arguments.of(NUM1,NUM2),Arguments.of(25,45),Arguments.of(-125,-25));
    }

}
