package HW3;

import javax.xml.catalog.Catalog;
import java.util.*;

public class HW3 {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task1() {
//        1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
//        Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
        ArrayList<String> array = new ArrayList<>(Arrays.asList("Яблоко", "11", "ksdjfksdf", "дом", "15", "13", "33", "Апельсин", "Дыня", "17", "39"));
        System.out.println(array);
        boolean deleted = true;
        for (int i = 0; i < array.size(); i++) {
            deleted = true;
            char[] simbol = array.get(i).toCharArray();
            for (int j = 0; j < simbol.length; j++) {
                if (!Character.isDigit(simbol[j])) {
                    deleted = false;
                }
            }
            if (deleted) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);
    }

    private static void task2() {
//        2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях -
//        названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
//        Пример:
//        "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//        "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//        "Детектив", "Десять негритят".
//        "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
        ArrayList<ArrayList<String>> catalog = new ArrayList<>();
        boolean enterGenre = true;
        Scanner iScaner = new Scanner(System.in);
        while (enterGenre == true) {
            ArrayList<String> Genre = new ArrayList<>();
            System.out.println("Введите название жанра и нажмите Enter. Если больше книг нет введите 0.");
            String genre = iScaner.nextLine();
            Genre.add(genre);
            if (Objects.equals(genre, "0")) {
                enterGenre = false;
            } else {
                System.out.println("Введите название книги и нажмите Enter. Если больше книг нет введите 0.");
                boolean enterBook = true;
                while (enterBook == true) {
                    String nameBook = iScaner.nextLine();
                    if (Objects.equals(nameBook, "0")) {
                        enterBook = false;
                    } else {
                        Genre.add(nameBook);
                    }
                }
                catalog.add(Genre);
            }
        }

        System.out.println(catalog);
    }
}
