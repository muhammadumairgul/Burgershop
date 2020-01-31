package Burgershop;


public class HealthyBurger extends Hamburger {

    private Dressing type1;
    private Dressing type2;
    private int dressCount=0;
    private Price Price;

    public HealthyBurger(String meatType, int burtype) {
        super("brown rye bread", meatType, burtype);

    }


    public void setDtyp(String ty1, int con1,String ty2, int con2 ){

        dressCount +=  con1 + con2;
        if(dressCount <= 6) {
            this.type1 = new Dressing(ty1, con1);
            this.type2 = new Dressing(ty2, con2);
        }
        else
            System.out.println("Dressing type can n't be more than 6");

    }

    public void setPrice(Price price) { // do not need a price setter
        this.Price = price;
    }

    public Price getPrice() {
        return Price;
    }

    @Override
    public Dressing getType1() {
        return type1;
    }

    @Override
    public Dressing getType2() {
        return type2;
    }
}