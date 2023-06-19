package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int realPart,int imaginaryPart) {
        return new Calculator(realPart, imaginaryPart);
    }
}
