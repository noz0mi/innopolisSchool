package javacourse.hometasks.homework7Add;

import javacourse.hometasks.homework7Add.DiscountProduct;
import javacourse.hometasks.homework7Add.Person;
import javacourse.hometasks.homework7Add.Product;
import javacourse.hometasks.homework7Add.Child;
import javacourse.hometasks.homework7Add.Adult;
import javacourse.hometasks.homework7Add.Retired;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Person getPerson(String name, List<Person> personList) {
        for (Person person: personList) {
            if (person.getName().equals(name)) {
                if (person.getAge() < 18) {
                    Person newChild = new Child();
                    newChild = person;
                    return newChild;
                }
                 else if (person.getAge() >= 65) {
                    Person newRetired = new Retired();
                    newRetired = person;
                    return newRetired;
                }
                 else {
                    Person newAdult = new Adult();
                    newAdult = person;
                    return newAdult;
                }
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

        List<Product> productList = new ArrayList<>();
        String flag0 = "";
        while (!flag0.equals("END")) {
            System.out.println("Введите название продукта и цену в формате: <Продукт> = <Цена>; " +
                    "или в формате: <Продукт> = <Цена>, %");
            String line0 = scanner.nextLine();
            String[] productStr = line0.split(" = ");
            if (productStr[1].contains(",")) {
               String[] discProductStr = productStr[1].split(", ");
               DiscountProduct discountProduct = new DiscountProduct();
               discountProduct.setName(productStr[0]);
               Double oldCost = Double.parseDouble(discProductStr[0].trim());
               discountProduct.setDiscount(Integer.parseInt(discProductStr[1].replace("%", "")));
               Double newCost = discountProduct.discountCost(oldCost, discountProduct.getDiscount());
               discountProduct.setCost(newCost);
               productList.add(discountProduct);
            }
            else {
                Product product = new Product();
                product.setName(productStr[0]);
                product.setCost(Double.parseDouble(productStr[1].trim()));
                productList.add(product);
            }
            System.out.println("Введите END, чтобы закончить ввод продуктов или нажмите Enter, чтобы продолжить");
            flag0 = scanner.nextLine();
        }
        System.out.println(productList);

        String flag = " ";
        List<Person> personList = new ArrayList<>();
        while (!flag.equals("END")) {
            System.out.println("Введите имя покупателя, сумму денег и возраст в формате: <Имя покупателя> = <Сумма денег>, <Возраст>");
            String line1 = scanner.nextLine();
            String[] personStr = line1.split(", ");
            if (Integer.parseInt(personStr[1].trim()) < 18) {
                Child person = new Child();
                person.setAge(Integer.parseInt(personStr[1].trim()));
                personStr = personStr[0].split(" = ");
                person.setName(personStr[0]);
                person.setMoney(Double.parseDouble(personStr[1]));
                personList.add(person);
            }
            else if (Integer.parseInt(personStr[1].trim()) >= 65) {
                Retired person = new Retired();
                person.setAge(Integer.parseInt(personStr[1].trim()));
                personStr = personStr[0].split(" = ");
                person.setName(personStr[0]);
                person.setMoney(Double.parseDouble(personStr[1]));
                personList.add(person);
            }
            else {
                Adult person = new Adult();
                person.setAge(Integer.parseInt(personStr[1].trim()));
                personStr = personStr[0].split(" = ");
                person.setName(personStr[0]);
                person.setMoney(Double.parseDouble(personStr[1]));
                System.out.println("Введите true, если человек может брать в кредит, или false, если не может");
                Boolean loanable = scanner.nextBoolean();
                scanner.nextLine();
                person.setLoanable(loanable);
                personList.add(person);
            }
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
            newPerson.buyingProduct(newProduct);
            System.out.println("Введите END, чтобы закончить или нажмите Enter, чтобы продолжить");
            end = scanner.nextLine();
        }


        for (Person person: personList) {
            person.printCart();
        }

    }
}
