package javacourse.hometasks.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку из двух слов на английском");
        String inputStr = scan.nextLine();
        int id = inputStr.indexOf(" ");
        int strlength = inputStr.length();

        char [] word1 = new char[id];
        char [] word2 = new char[strlength - (id + 1)];

        inputStr.getChars(0, id, word1, 0);
        inputStr.getChars(id + 1, strlength, word2, 0);

        Arrays.sort(word1);
        Arrays.sort(word2);

        String result1 = new String(word1);
        String result2 = new String(word2);

        System.out.println("Результат программы:");
        System.out.println(result1.toLowerCase());
        System.out.println(result2.toLowerCase());
    }
}
