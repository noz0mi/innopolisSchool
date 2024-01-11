package javacourse.hometasks.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Person getPerson(String name, List<Person> personList) {
        for (Person person: personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        System.out.println("Неправильное имя покупателя");
        return null;
    }

    public static Product getProduct(String name, List<Product> productList) {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        System.out.println("Неправильное название продукта");
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product bread = new Product(50, "Хлеб");
        Product eggs = new Product(140, "Яйца");
        Product orangeJuice = new Product(140, "Апельсиновый сок");
        Product milk = new Product(100, "Молоко");
        Product coffee = new Product(350, "Кофе");
        Product cake = new Product(1000, "Торт");
        Product [] products = new Product[] {bread, eggs, orangeJuice, milk, coffee, cake};
        List<Product> productList = new ArrayList<>(Arrays.asList(products));

        String flag = " ";
        List<Person> personList = new ArrayList<>();
        while (!flag.equals("END")) {
            System.out.println("Введите имя покупателя и сумму денег в формате: <Имя покупателя> = <Сумма денег>");
            String line1 = scanner.nextLine();
            String[] personStr = line1.split(" = ");
            Person person = new Person();
            person.setName(personStr[0]);
            person.setMoney(Integer.parseInt(personStr[1].trim()));
            personList.add(person);
            System.out.println("Введите END, чтобы закончить создавать покупателей или нажмите Enter, чтобы продолжить");
            flag = scanner.nextLine();
        }

        String end = " ";
        System.out.println("Вот список продуктов, доступных к покупке: " + productList.toString());
        System.out.println("Введите имя покупателя и название продукта в формате: <Имя покупателя> = <Название продукта>");
        while (!end.equals("END")) {
            String line2 = scanner.nextLine();
            String[] personProduct = line2.split(" = ");
            Person newPerson = getPerson(personProduct[0], personList);
            Product newProduct = getProduct(personProduct[1], productList);
            if (newPerson != null && newProduct != null)
                newPerson.Addition(newProduct);
            System.out.println("Введите END, чтобы закончить или нажмите Enter, чтобы продолжить");
            end = scanner.nextLine();
        }
        for (Person person: personList) {
            person.getCart();
        }
    }
}
