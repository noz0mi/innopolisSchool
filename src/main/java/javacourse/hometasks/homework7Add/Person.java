package javacourse.hometasks.homework7Add;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private Integer age;
    private Double money;
    private List<Product> cart = new ArrayList<>();

    //конструкторы
    public Person () {

    }
    public Person (String name, Double money, Integer age) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException {
        if (name == "") {
            throw new RuntimeException("Имя не может быть пустой строкой!");
        }
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) throws RuntimeException {
        if ( money < 0) {
            throw new RuntimeException("Сумма денег не может быть отрицательным числом!");
        }
        this.money = money;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(money, person.money) && Objects.equals(cart, person.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money, cart);
    }

    @Override
    public String toString() {
        return "Покупатель:" +
                "Имя = " + name + '\n'  +
                "Сумма денег = " + money + '\n' +
                "Возраст = " + age + '\n' +
                "Корзина с продуктами =" + cart;
    }

    public void printCart() {
        System.out.print(name + " - ");
        if (cart.isEmpty())
            System.out.println("ничего не купил(а)");
        else {
            for (Product product: cart) {
                System.out.print(product.getName() + ", ");
            }
        }
    }

    public void buyingProduct (Product product) {
        if (this.money < product.getCost())
            System.out.println(this.getName() + " не может позволить себе " + product.getName());
        else {
            this.setMoney(getMoney() - product.getCost());
            cart.add(product);
        }
    }
}
