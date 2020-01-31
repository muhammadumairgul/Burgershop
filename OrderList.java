package Burgershop;

public class OrderList {

    private String burgerName;
    private Double burgerPrice;

    public OrderList(String burgerName, Double burgerPrice) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public Double getBurgerPrice() {
        return burgerPrice;
    }
}
