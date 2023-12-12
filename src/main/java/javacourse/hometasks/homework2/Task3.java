package javacourse.hometasks.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String example = scan.nextLine();
        System.out.println("Сколько раз нужно вывести эту строку?");
        int n = scan.nextInt();
        String sum = example;
        for (int i = 0; i < n - 1; i++) {
             sum += example;
        }
        System.out.println(sum);
    }
}
