package sky.pro.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public void sayHello(){
        this.calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return this.calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return this.calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return this.calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return this.calculatorService.divide(num1, num2);
    }

}
