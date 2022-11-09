import jdk.internal.org.objectweb.asm.commons.InstructionAdapter;

public class calculator {

    public static double add(double a, double b){
        return (a+b);
    }

    public static double sub(double a, double b){
        return (a-b);
    }

    public static double mul(double a, double b){
        return (a*b);
    }

    public static double div(double a, double b){
        if(b == 0){
            throw new NullPointerException("Error! b is not zero!");
        }
        else {
            return (a/b);
        }
    }
}


// Использую паттерн проектирования Adapter

class Calculator {
    double operation(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '*':
                return num1 * num2;
            case '-':
                return num1 - num2;
            case '/':
                if(num2 == 0){
                    throw new NullPointerException("Error! b is not zero!");
                }
                else {
                    return num1/num2;
                }
            default:
                return 0;
        }
    }
}

// Допустим нам нужно создать улучшенную версию калькулятора
class NewCalculator {
    double add(double num1, double num2) {
        return num1 + num2;
    }
    double sub(double num1, double num2) {
        return num1 - num2;
    }
    double div(double num1, double num2) {
        if(num2 == 0){
            throw new NullPointerException("Error! b is not zero!");
        }
        return num1 / num2;
    }
    double mul(double num1, double num2) {
        return num1 * num2;
    }
}

// Теперь адаптируем новый калькулятор под функционал старого
class CalculatorAdapter {
    NewCalculator calc = new NewCalculator();
    double operation(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return calc.add(num1, num2);
            case '-':
                return calc.sub(num1, num2);
            case '*':
                return calc.mul(num1, num2);
            case '/':
                if(num2 == 0){
                    throw new NullPointerException("Error! b is not zero!");
                }
                return calc.div(num1, num2);
            default:
                return 0;
        }
    }
}
