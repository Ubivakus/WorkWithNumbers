import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> listOfPositive = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        Set<Integer> sortedList = new TreeSet<>();

        //Помещаем в новый список все положительные числа
        for (int i : intList) {
            if (i > 0) {
                listOfPositive.add(i);
            }
        }
        //Помещаем в новый список все четные числа из предыдущего списка
        for (int i : listOfPositive) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        //Отсортировали числа по возрастанию
        Collections.sort(evenNumbers);
        //Вывели результат на экран
        System.out.println(evenNumbers.toString());
    }
}
