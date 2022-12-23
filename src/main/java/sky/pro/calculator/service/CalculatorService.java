package sky.pro.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

    public void sayHello() {
        System.out.println("Добро пожаловать в калькулятор");
    }

    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
