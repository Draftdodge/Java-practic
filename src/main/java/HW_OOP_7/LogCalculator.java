package calculator;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    private Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Искомое число: " + calculable.getResult());
    }

    @Override
    public Calculable sum(int realPartSecondNumber, int imaginaryPartSecondNumber) {
        logger.writeLog("Введено число: " + realPartSecondNumber + " + i * " + imaginaryPartSecondNumber);
        return calculable.sum(realPartSecondNumber, imaginaryPartSecondNumber);
    }

    @Override
    public Calculable multi(int realPartSecondNumber, int imaginaryPartSecondNumber) {
        logger.writeLog("Введено число: " + realPartSecondNumber + " + i * " + imaginaryPartSecondNumber);
        return calculable.multi(realPartSecondNumber, imaginaryPartSecondNumber);
    }

    @Override
    public String getResult() {
        String result = calculable.getResult();
        logger.writeLog("Результат : " + result);
        return result;
    }
}