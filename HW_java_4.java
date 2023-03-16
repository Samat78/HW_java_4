//1.Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class HW_java_4 {
//    public static void main(String[] args) {
//        LinkedList<String> inputLinkedList = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        String srtFromCons;
//        System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");
//
//        while (!(srtFromCons = scanner.nextLine()).equals("print"))
//            inputLinkedList.addFirst(srtFromCons);
//        scanner.close();
//        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());
//
//
//
//        /*int stop = 0;
//        System.out.println("Введите желаемое количество элементов: ");
//        int countElements = scanner.nextInt();
//        System.out.println("Заполните LinkedList строками.\nДля выхода используйте слово 'print'");
//        while (stop <= countElements) {
//            inputLinkedList.add(scanner.nextLine());
//            if (!(srtFromCons = scanner.nextLine()).equals("print")) {
//                inputLinkedList.addFirst(srtFromCons);
//                if (!(srtFromCons = scanner.nextLine()).equals("exit")) {
//                    inputLinkedList.addLast(srtFromCons);
//                }
//            }
//            stop++;
//        }*/ // не получилось :(
//
//    }
//}

//2.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HW_java_4 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomLinkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            randomLinkedList.add(random.nextInt(1, 10));
        }

        System.out.println("Случайный LinkedList: " + randomLinkedList.toString());

        List<Integer> RevertLinkedList = new LinkedList<>();

        for (int i = randomLinkedList.size() - 1; i >= 0; i--) {
            RevertLinkedList.add(randomLinkedList.get(i));
        }

        System.out.println("Перевёрнутый LinkedList: " + RevertLinkedList.toString());
    }
}