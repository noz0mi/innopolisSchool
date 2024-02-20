package javacourse.hometasks.homework7Add;

import java.time.LocalDate;
import java.util.Objects;

public class DiscountProduct extends Product {
private Integer discount;
private LocalDate expireDate;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public DiscountProduct() {}
    public DiscountProduct(Double cost, String name,Boolean childLegal, int discount) throws RuntimeException {
        super(cost, name, childLegal);
        this.discount = discount;
    }

    public Double discountCost (Double cost, Integer discount) {
        Double newcost = cost *  (100 - discount)/ 100;
        return newcost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountProduct that = (DiscountProduct) o;
        return discount == that.discount && Objects.equals(expireDate, that.expireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, expireDate);
    }

    @Override
    public String toString() {
        return "\n Скидочный продукт: " + super.getName() + '\n' +
                "Скидка = " + discount + '\n' +
                "Срок действия = " + expireDate + '\n' +
                "Цена = " + super.getCost();
    }
}
