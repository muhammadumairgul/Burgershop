package Burgershop;

public class Deluxehamburger extends Hamburger {

    private static String extra1="chips";
    private static String extra2="drinks";

    private Price Price;

    public Deluxehamburger(String rollType, String meatType, int burtype) {
        super(rollType, meatType, burtype);
        setPrice(new Price(burtype, 0));

    }


    public void setPrice(Price price) { // do not need a price setter
        this.Price = price;
    }

    public Price getPrice() {
        return Price;
    }

    public static String getExtras() {
        return extra1 + extra2;
    }

    public static String getExtra2() {
        return extra2;
    }



}
