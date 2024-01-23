package javacourse.hometasks.homework7;

import java.util.Objects;

public class Product {
    private Double cost;
    private String name;

    //конструкторы

    public Product() {

    }
    public Product(Double cost, String name) throws RuntimeException {
        if (cost <= 0) {
            throw new RuntimeException("Цена товара не может быть неположительной!");
        }
        if (name.length() <= 3) {
            throw new RuntimeException("Название товара не может быть  меньше 3 символов!");
        }
        if (name.matches("\\d")) {
            throw new RuntimeException("Название товара не может состоять только из цифр");
        }
        this.cost = cost;
        this.name = name;
    }
    // геттеры и сеттеры
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) throws RuntimeException {
        if (cost <= 0) {
            throw new RuntimeException("Цена товара не может быть неположительной!");
        }
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException  {
        if (name == "") {
            throw new RuntimeException("Название не может быть пустой строкой!");
        }
        if (name.length() <= 3) {
            throw new RuntimeException("Название товара не может быть  меньше 3 символов!");
        }
        if (name.matches("\\d") && !name.matches("[а-яА-я]")) {
            throw new RuntimeException("Название товара не может состоять только из цифр");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(cost, product.cost) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name);
    }

    @Override
    public String toString() {
        return "\n Продукт: " + name + '\n' +
                  "Цена:" + cost;
    }
}
