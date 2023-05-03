package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HW5 {
    public static void main(String[] args) {
    //    task1();
        task2();
    }

    private static void task1() {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();

        nameBook.put(0, "Абонент 1");
        nameBook.put(1, "Абонент 2");
        nameBook.put(2, "Абонент 3");
        nameBook.put(3, "Абонент 4");
        nameBook.put(4, "Абонент 5");

        for (int i = 0; i < nameBook.size(); i++) {
            if (phoneBook.get(i) == null) {
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("+7-911-123-45-" + i + i);
                if (i % 2 == 0) {
                    phoneBook.get(i).add("+7-921-123-45-" + i + i);
                }
            }
            System.out.println("Телефонные номера " + nameBook.get(i) + " : " + phoneBook.get(i));
        }
    }

    private static void task2() {
        HashMap<String, String> employerMap = new HashMap<>();
        HashMap<String, Integer> countNameMap = new HashMap<String, Integer>();

        employerMap.put("Иванов", "Иван");
        employerMap.put("Петрова", "Светлана");
        employerMap.put("Белова", "Кристина");
        employerMap.put("Мусина", "Анна");
        employerMap.put("Крутова", "Анна");
        employerMap.put("Юрин", "Иван");
        employerMap.put("Лыков", "Петр");
        employerMap.put("Чернов", "Павел");
        employerMap.put("Чернышов", "Петр");
        employerMap.put("Федорова", "Мария");
        employerMap.put("Светлова", "Марина");
        employerMap.put("Савина", "Мария");
        employerMap.put("Рыкова", "Мария");
        employerMap.put("Лугова", "Марина");
        employerMap.put("Владимирова", "Анна");
        employerMap.put("Мечников", "Иван");
        employerMap.put("Петин", "Петр");
        employerMap.put("Иванов", "Еж");


        for (String name : employerMap.values()) {
            if (!countNameMap.containsKey(name)) {
                if (Collections.frequency(employerMap.values(), name) > 1) {
                    countNameMap.put(name, Collections.frequency(employerMap.values(), name));
                }
            }
        }
        countNameMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
