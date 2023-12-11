package javacourse.hometasks.homework3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TV samsung = new TV();
        System.out.println("Введите название телевизора: ");
        String name = scan.next();
        samsung.setName(name);
        System.out.println("Введите количество каналов телевизора: ");
        int channels = scan.nextInt();
        samsung.setChannels(channels);
        System.out.println("Введите серийный номер телевизора: ");
        int id = scan.nextInt();
        samsung.setId(id);
        System.out.println("Введите диагональ экрана телевизора: ");
        double screen_size = scan.nextDouble();
        System.out.println("Включён ли телевизор, введите true или false: ");
        samsung.setScreen_size(screen_size);
        boolean state1 = scan.nextBoolean();
        samsung.setState(state1);
        System.out.println(samsung);
        state1 = samsung.getState();
        samsung.chooseChannel(state1);
        System.out.println();


        TV xiaomi = new TV();
        xiaomi.setName("Xiaomi");
        xiaomi.setChannels(100);
        xiaomi.setScreen_size(21);
        xiaomi.setId(2);
        xiaomi.setState(false);
        System.out.println(xiaomi);
        boolean state2 = xiaomi.getState();
        xiaomi.chooseChannel(state2);

    }
}
