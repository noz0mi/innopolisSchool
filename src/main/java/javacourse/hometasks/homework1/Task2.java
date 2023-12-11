package javacourse.hometasks.homework1;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Player1 и Player2 играют в игру “Камень, ножницы, бумага. " +
                "Каждый из них показывает свою фигуру:" +
                "камень-0, ножницы-1, бумага-2." );
  //     int player1 = rnd.nextInt(0,2);
  //     int player2 = rnd.nextInt(0,2);
        Scanner scan = new Scanner(System.in);
        int player1 = scan.nextInt();
        int player2 = scan.nextInt();
        System.out.println("Player1 = " + player1);
        System.out.println("Player2 = " + player2);
        if ((player1 == 0 && player2 == 1) || (player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 0))
            System.out.println("Player1 победил!");
        else if ((player1 == 0 && player2 == 0) || (player1 == 1 && player2 == 1) || (player1 == 2 && player2 == 2))
            System.out.println("Ничья!");
        else
            System.out.println("Player2 победил!");
    }
}
