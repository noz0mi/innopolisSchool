package javacourse.hometasks.homework7Add;

import java.util.List;

public class Retired  extends Person {

    public Retired() {

    }
    public Retired(String name, Double money, Integer age) throws RuntimeException {
        super(name, money, age);
        if (age < 65 ) {
            throw new RuntimeException("Покупатель, которого вы хотите создать не относится к классу \" Пенсионер \". \n " +
                    "Возраст должен быть в рамках от 65 лет.");
        }
    }
    @Override
    public void buyingProduct (Product product) {
        if (this.getMoney() < product.getCost())
            System.out.println(this.getName() + " не может позволить себе " + product.getName());
        else if (product instanceof DiscountProduct) {
            Double newcost = ((DiscountProduct) product).getCost();
            product.setCost(newcost * 0.95);
            this.setMoney(getMoney() - product.getCost());
            List<Product> cart = super.getCart();
            cart.add(product);
            super.setCart(cart);
        }
        else {
            System.out.println("Пенсионеры отказываются покупать неакционные товары.");
        }
    }

}
