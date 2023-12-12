package javacourse.hometasks.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру по Фаренгейту:");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " градусов по Фаренгейту равно " + celsius + " градусов по Цельсию.");
    }
}
