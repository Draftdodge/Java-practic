package HW2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Hw2 {
        public static void main(String[] args) {
//               System.out.print(task_1(null, "Russia", "SPb", null));
        task_2("C:\\ESD");
        }

        private static String task_1(String name, String country, String city, String age) {
//            1. Дана строка sql-запроса "select * from students where ".
//            Сформируйте часть WHERE этого запроса, используя StringBuilder.
//            Данные для фильтрации приведены ниже в виде json-строки.
//            Если значение null, то параметр не должен попадать в запрос.
//                Пример 1:
//                Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//                Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//
//                Пример 2:
//                Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//                Результат: SELECT * FROM USER;
                StringBuilder sb = new StringBuilder("SELECT * FROM USER WHERE");

                if (name != null) {
                        sb.append(" name = '").append(name).append("' and");
                }
                if (country != null) {
                        sb.append(" country = '").append(country).append("' and");
                }
                if (city != null) {
                        sb.append(" city = '").append(city).append("' and");
                }
                if (age != null) {
                        sb.append(" age = '").append(age).append("' and");
                }
                sb.delete(sb.length() - 5, sb.length());
                String sqlQuery = sb.toString();
                return sqlQuery;

        }

        private static void task_2(String pathDir) {
//                2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//                1 Расширение файла: txt
//                2 Расширение файла: pdf
//                3 Расширение файла:
//                4 Расширение файла: jpg
                File file = new File(pathDir);
                if (!(file.exists() || file.isDirectory())) {
                        return;
                }
                StringBuilder sb = new StringBuilder();
                for (File fileName : file.listFiles()) {
                        if (fileName.isFile()) {
                            String expansion = "";
                            if (fileName.getName().contains(".")) {
                                expansion = fileName.getName().substring(fileName.getName().lastIndexOf(".") + 1);
                            }
                                sb.append("Расширение файла: ").append(expansion).append("\n");
                        }
                }
                String result = sb.toString();
                System.out.print(result);
        }
}
