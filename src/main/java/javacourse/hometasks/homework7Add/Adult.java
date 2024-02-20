package javacourse.hometasks.homework7Add;

import java.util.List;

public class Adult extends Person {
    private Boolean loanable;

    public Adult() {

    }
    public Adult(String name, Double money, Integer age) throws RuntimeException {
        super(name, money, age);
        if (age > 65 && age < 18) {
            throw new RuntimeException("Покупатель, которого вы хотите создать не относится к классу \" Взрослый \". \n " +
                    "Возраст должен быть в рамках от 18 до 65 лет.");
        }
    }

        public Boolean getLoanable() {
        return loanable;
    }

    public void setLoanable(Boolean loanable) {
        this.loanable = loanable;
    }
    @Override
    public void buyingProduct (Product product) {
        if (this.getMoney() < product.getCost() && !this.getLoanable())
            System.out.println(this.getName() + " не может позволить себе " + product.getName() + ", и не может покупать в кредит");
        else {
            this.setMoney(getMoney() - product.getCost());
            List<Product> cart = super.getCart();
            cart.add(product);
            super.setCart(cart);
        }
    }
}
