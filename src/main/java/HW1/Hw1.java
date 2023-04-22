package HW1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;


public class Hw1 {
    public static void main(String[] args) {
//        1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
//        типа int длиной len, каждая ячейка которого равна initialValue;
        //  System.out.println(Arrays.toString(ArrayNew(5, 6)));
//        2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        //  MinMax(7);
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
//        элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        //  DiagMatrix();
//        4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        //  GoodTime();
//        5.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//        или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы
//        смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
//        (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        RotateArray(arr, -7);
    }

    private static void RotateArray(int[] array, int n) {
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        int temp = n;
        n = Math.abs(n);
        if (Math.abs(n) > array.length){
            while (n < array.length)
             n = n - array.length;
        }
        if (temp < 0){
            n = -n;
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < array.length; j++) {
                    temp = array[array.length - j - 1];
                    array[array.length - j - 1] = array[array.length - j];
                    array[array.length - j] = temp;
                }
            }
        } else if (n < 0) {
            for (int i = 0; i > n; i--) {
                for (int j = 0; j < array.length - 1; j++) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.print("Полученный массив: ");
        System.out.println(Arrays.toString(array));
    }

    private static void PrintMatrix(int[][] matrx) {
        for (int i = 0; i < matrx.length; i++) {
            System.out.print("[  ");
            for (int j = 0; j < matrx.length; j++) {
                System.out.print(matrx[i][j] + "  ");
            }
            System.out.println(" ]");
        }
    }

    private static int[] ArrayNew(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    private static void MinMax(int len) {
        int[] arr = new int[len];
        System.out.println("Введите значения массива через Enter:");
        for (int i = 0; i < len; i++) {
            System.out.print(i + 1 + ": ");
            Scanner iScaner = new Scanner(System.in);
            arr[i] = iScaner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 1; j < len; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    private static void DiagMatrix() {

        Scanner iScaner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int size = iScaner.nextInt();
        System.out.print("Введите значения диагонального элемента матрицы: ");
        int elem = iScaner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = elem;
            matrix[i][size - i - 1] = elem;
        }
        PrintMatrix(matrix);

    }

    private static void GoodTime() {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = iScaner.nextLine();
        Date date = new Date();
        int Hours = date.getHours();
        if ((Hours >= 5) && (Hours < 12)) {
            System.out.println("Доброе утро," + name + " !");
        }
        if ((Hours >= 12) && (Hours < 18)) {
            System.out.println("Добрый день," + name + " !");
        }
        if ((Hours >= 18) && (Hours < 23)) {
            System.out.println("Добрый вечер," + name + " !");
        }
        if ((Hours >= 23) && (Hours < 5)) {
            System.out.println("Доброй ночи," + name + " !");
        }

    }

}


