package Burgershop;

public class Price {


    private int burgerType;
    private int additions=0;
    private static double basePrice=20;
    private double finalPrice=0;

    public Price(int burgerType, int additions) {
        this.burgerType = burgerType;
        this.additions = additions;


    }

    public double getBill() {
        if(burgerType==3) {
            finalPrice= basePrice + (additions *2) + 5;
            return finalPrice;

        }
        else if(burgerType==2){
            finalPrice= basePrice + (additions *2);
            return finalPrice;
        }
        else {
            finalPrice = basePrice + additions;
            return finalPrice;
        }
    }
}
