package Burgershop;


public class HealthyBurger extends Hamburger {

    private dressing type1;
    private dressing type2;
    private int dressCount=0;
    private Price Price;

    public HealthyBurger(String meatType, int burtype) {
        super("brown rye bread", meatType, burtype);

    }


    public void setDtyp(String ty1, int con1,String ty2, int con2 ){

        dressCount +=  con1 + con2;
        this.type1= new dressing(ty1, con1);
        this.type2= new dressing(ty2, con2);

    }

    public void setPrice(Price price) { // do not need a price setter
        this.Price = price;
    }

    public Price getPrice() {
        return Price;
    }

    @Override
    public dressing getType1() {
        return type1;
    }

    @Override
    public dressing getType2() {
        return type2;
    }
}