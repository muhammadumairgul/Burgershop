public class Price {

    private double bill;
    private int burgerType;
    private int additions=0;
    private double basePrice=20;

    public Price(int burgerType, int additions) {
        this.burgerType = burgerType;
        this.additions = additions;
        this.bill=0;

    }

    public double getBill() {
        if(burgerType==3) {

          bill= basePrice + additions *2 + 5;
        return bill;

        }
        if(burgerType==2){
          bill= basePrice+ additions*2;
        return bill;

        }

        bill= basePrice + additions;
        return bill;
    }
}
