package calculator;

public final class Calculator implements Calculable {

    private int realPart;
    private int imaginaryPart;


    public Calculator(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public Calculable sum(int realPartSecondNumber, int imaginaryPartSecondNumber) {
        realPart += realPartSecondNumber;
        imaginaryPart += imaginaryPartSecondNumber;
        return this;    }


    @Override
    public Calculable multi(int realPartSecondNumber, int imaginaryPartSecondNumber) {
        realPart = ((realPart * realPartSecondNumber) - (imaginaryPart * imaginaryPartSecondNumber));
        imaginaryPart = ((imaginaryPart * realPartSecondNumber) + (imaginaryPartSecondNumber * realPart));
        return this;
    }

    @Override
    public String getResult() {
        return String.format("%d + i * %d",realPart,imaginaryPart);
    }
}
