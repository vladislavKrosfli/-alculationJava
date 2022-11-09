import java.io.IOException;

public class CalculationFacade {
    private operatorCalc oper;
}

class operatorCalc{
    double calculate(double num1, double num2, char ch){
        switch (ch){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
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