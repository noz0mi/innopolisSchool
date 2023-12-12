package javacourse.hometasks.homework4;

public class Task2 {
    public static void main(String[] args) {
        String line = ">>--><--<<<--<<>>-->>---->>--<--->>";
        int k = 0;
        int id = line.indexOf(">>-->");
        while (id != -1) {
            line = line.replaceFirst(">>-->", "");
            k++;
            id = line.indexOf(">>-->");
        }
        id = line.indexOf("<--<<");
        while (id != -1) {
            line = line.replaceFirst("<--<<", "");
            k++;
            id = line.indexOf("<--<<");
        }
        System.out.println("Количество стрел в строке равно: " + k);

    }
}
