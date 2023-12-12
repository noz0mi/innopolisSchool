package javacourse.hometasks.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите букву английского языка:");
        String letter = scan.nextLine();
        int index = alphabet.indexOf(letter);
        int previousIndex = index - 1;
        if (letter.equals("q")) {
            previousIndex = 25;
        }
        System.out.println("Предыдущая буква: " + alphabet.charAt(previousIndex));
    }
}
