package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        int realPart = promptInt("Введите действительную часть 1-ого числа: ");
        int imaginaryPart = promptInt("Введите мнимую часть 1-ого числа: ");
        Calculable calculator = calculableFactory.create(realPart, imaginaryPart);
        while (true) {
            while (true) {
                String cmd = prompt("Введите команду (*, +) : ");
                if (cmd.equals("*")) {
                    int realPart2 = promptInt("Введите действительную часть следующего числа: ");
                    int imaginaryPart2 = promptInt("Введите мнимую часть следующего числа: ");
                    calculator.multi(realPart2, imaginaryPart2);
                    break;
                }
                if (cmd.equals("+")) {
                    int realPart2 = promptInt("Введите действительную часть следующего числа: ");
                    int imaginaryPart2 = promptInt("Введите мнимую часть следующего числа: ");
                    calculator.sum(realPart2, imaginaryPart2);
                    break;
                }
            }
            String result = calculator.getResult();
            System.out.printf("Результат %s\n", result);
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
