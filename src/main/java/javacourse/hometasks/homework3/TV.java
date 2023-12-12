package javacourse.hometasks.homework3;

import java.util.Scanner;

public class TV {
    private String name;
    private int channels;
    private double screen_size;
    private int id;
    private boolean state;

    //конструктор
    public TV() {

    }

    //геттеры и сеттеры
    public String getName() { return name;}
    public void setName(String name) {this.name = name;}
    public int getChannels() { return channels;}

    public void setChannels(int channels) { this.channels = channels;}

    public double getScreen_size() { return screen_size;}

    public void setScreen_size(double screen_size) { this.screen_size = screen_size;}

    public int getId() { return id;}

    public void setId(int id) { this.id = id;}
    public boolean getState() {return state;}
    public void setState (boolean state) {this.state = state;}

    // Меняет состояние телевизора со включенного на выключенный и наоборот
    public boolean changeState(boolean state) {
        if (this.state == state) {
            this.state = !state;
        }
        System.out.println("Состояние телевизора " + this.name + " на данный момент: " + this.state);
        return this.state;
    }

    // Включает выбранный канал
    public void chooseChannel(boolean state) {
        if (!this.state) {
            System.out.println("Телевизор выключен, нужно сначала включить, чтобы выбрать канал, включаю телевизор...");
            changeState(this.state);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер канала в пределах " + this.channels);
        int channel = scan.nextInt();
        boolean i = true;
        while (i) {
            if (channel > this.channels || channel < 1) {
                System.out.println("Такого канала нет, выберите другой");
                channel = scan.nextInt();
            } else {
                i = false;
                System.out.println("Выбран канал номер " + channel);
            }
        }
    }

    public String toString() {
        return "Телевизор с параметрами:\n" +
                this.name + " - Наименование\n" +
                this.channels + " - Количество каналов\n" +
                this.screen_size + " - Диагональ экрана\n" +
                this.id + " - Серийный номер\n" +
                this.state + " - Состояние (включён - true, выключен - false) \n";
    }

}
