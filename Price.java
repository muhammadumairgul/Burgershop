public class Price {

    private double bill;
    private int burgerType;
    private int additons;
    private double basePrice;

    public Price(int burgerType, int additons) {
        this.burgerType = burgerType;
        this.additons = additons;
        this.bill=0;
        this.basePrice=10;
    }

    public double getBill() {
        if(burgerType==3) {

          bill= basePrice + additons*2 + 5;
        return bill;

        }
        if(burgerType==2){
          bill= basePrice+ additons*2;
        return bill;

        }

        bill= basePrice;
        return bill;
    }
}
