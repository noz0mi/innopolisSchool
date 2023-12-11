package javacourse.hometasks.homework2;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double sum = number1 + number2;
        System.out.println("Сумма двух чисел равна: " + sum);
        double diff = number1 - number2;
        System.out.println("Разница двух чисел равна: " + diff);
        double mult = number1 * number2;
        System.out.println("Произведение двух чисел равно: " + mult);
        double aver = (number1 + number2) / 2;
        System.out.println("Среднее двух чисел равно: " + aver);
        double module = abs(number1 - number2);
        System.out.println("Расстояние двух чисел равно: " + module);
        double MAX = max(number1, number2);
        System.out.println("Большее из двух чисел равно: " + MAX);
        double MIN = min(number1, number2);
        System.out.println("Меньшее из двух чисел равно: " + MIN);
    }
}
