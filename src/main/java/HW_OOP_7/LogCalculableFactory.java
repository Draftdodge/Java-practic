package calculator;

public class LogCalculableFactory implements ICalculableFactory {
    Logger logger;
    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int realPart, int imaginaryPart) {
        return new LogCalculator(new Calculator(realPart,imaginaryPart), logger);
    }




}