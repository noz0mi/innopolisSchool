package javacourse.hometasks.homework7Add;

import java.util.List;

public class Child extends Person {
    public Child () {

    }

    public Child(String name, Double money, Integer age) throws RuntimeException {
        super(name, money, age);
        if (age > 17) {
            throw new RuntimeException("Покупатель, которого вы хотите создать не может быть ребёнком. \n " +
                    "Возраст должен быть в рамках от 0 до 17 лет.");
        }
    }
    @Override
    public void Buying (Product product) {
        if (this.getAge() < 6) {
            System.out.println("Ребёнок не может совершать покупки до 6 лет");
        }
        else if (this.getMoney() < product.getCost())
            System.out.println(this.getName() + " не может позволить себе " + product.getName());
        else {
            this.setMoney(getMoney() - product.getCost());
            List<Product> cart = super.getCart();
            cart.add(product);
            super.setCart(cart);
        }
    }
}
