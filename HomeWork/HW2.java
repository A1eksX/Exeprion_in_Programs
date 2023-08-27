package HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args)
            throws InvalidNumberException, DivisionByZeroException, NumberOutOfRangeException, NumberSumException {
        // 1 задача
//        try {
//            task1();
//        }catch (InvalidNumberException e){
//            System.out.println(e.getMessage() + " " + e.getNum());
//        }

        // 2 задача
//        try {
//            System.out.println(task2());
//        }catch (DivisionByZeroException e){
//            System.out.println(e.getMessage());
//        }
        
        // 3 задача
        try {
            task3();
        }catch (DivisionByZeroException | NumberOutOfRangeException | NumberSumException e){
            System.out.println(e.getMessage());
        }

    }

/*
    Задача 1:
    Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
    Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
    сообщением "Некорректное число". В противном случае программа должна выводить сообщение "Число корректно".
*/
    public static void task1() throws InvalidNumberException {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число больше 0: ");
            int num = number.nextInt();
            if( num <= 0) throw new InvalidNumberException ("Некорректное число", num);
            else System.out.println("Число корректно");
        }

/*
    Задача 2:
    Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
    Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с
    сообщением "Деление на нуль недопустимо". В противном случае программа должна выводить результат деления.

    Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception.
    Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
 */
    public static double task2() throws DivisionByZeroException {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите делимое и делитель: ");
        int dividend = number.nextInt();
        int divisor = number.nextInt();

        if (divisor == 0) {
            throw new DivisionByZeroException("Деление на нуль не допустимо");
        }
        return (double) dividend / divisor;
    }

    /*
    Задача3: - по желанию
    Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

        Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне
    допустимого диапазона".
        Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне
    допустимого диапазона".
        Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
    "Сумма первого и второго чисел слишком мала".
        Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
    В противном случае программа должна выводить сообщение "Проверка пройдена успешно".
    - необходимо создать 3 класса собственных исключений
     */
    public static void task3() throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите 3 числа, первое - меньше 100, второе - больше 0, третье - не равное 0 : ");
        int oneNumber = number.nextInt();
        int twoNumber = number.nextInt();
        int threeNumber = number.nextInt();

        if(oneNumber > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        else if(twoNumber < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        else if ((oneNumber + twoNumber) < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        else if (threeNumber == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        else System.out.println("Проверка пройдена успешно");
    }

}
