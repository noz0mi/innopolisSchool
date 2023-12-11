package javacourse.hometasks.homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность сетки:");
        int n = scan.nextInt();
        System.out.println("Введите символ для сетки:");
        String symbol = scan.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(symbol);
                if (j + 1 == n)
                    System.out.println();
            }
        }
    }
}
