package javacourse.hometasks.homework6;

import java.util.Objects;

public class Product {
    private Integer cost;
    private String name;

    //конструкторы

    public Product() {

    }
    public Product(Integer cost, String name) {
        this.cost = cost;
        this.name = name;
    }
    // геттеры и сеттеры
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) throws RuntimeException {
        if (cost < 0) {
            throw new RuntimeException("Цена товара не может быть отрицательной!");
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
        return "Продукт" + '\n' +
                "Цена:" + cost + '\n' +
                "Название: " + name + '\n';
    }
}
