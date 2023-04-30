package HW4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class HW4 {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        // --- Task 1 ---
//          1. Реализовать консольное приложение, которое:
//          Принимает от пользователя и “запоминает” строки.
//                Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//                а первая - последней.
//                Если введено revert, удаляет предыдущую введенную строку из памяти.

        LinkedList<String> list = new LinkedList<>();
        while (true) {
            String inputStr = getFromUser();
            if (inputStr.equals("stop")) {
                break;
            }
            workWithList(list,inputStr);
        }
}


    public static void workWithList(LinkedList<String> list, String inputFromUser) {

        if (inputFromUser.equals("print")) {
            System.out.println(list);
        } else if (inputFromUser.equals("revert")) {
            list.removeFirst();
        } else if (inputFromUser.equals("revers")) {
            reverseList(list);
        } else {
            list.addFirst(inputFromUser);
        }
    }

    public static String getFromUser() {
        System.out.println("Введите строку:");
        String input = scaner.nextLine();
        return input;
    }

    public static LinkedList<String> reverseList(LinkedList<String> list) {
        // --- Task 2 ---
//        2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        String temp = "";
        for (int i = 0; i < list.size() / 2; i++) {
            temp = list.get(i);
            list.remove(i);
            list.add(i, list.get(list.size() - i - 1));
            list.remove(list.size() - i - 1);
            list.add(list.size() - i, temp);
        }
        return list;
    }


}
