package calculator;

public interface ICalculableFactory {
    Calculable create(int realPart, int imaginaryPart);

}
