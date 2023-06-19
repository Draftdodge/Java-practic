package calculator;

public interface Calculable {
    Calculable sum(int realPartSecondNumber, int imaginaryPartSecondNumber);

    Calculable multi(int realPartSecondNumber, int imaginaryPartSecondNumber);

    String getResult();
}
