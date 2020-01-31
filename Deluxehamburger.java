package Burgershop;

public class Deluxehamburger extends Hamburger {

    private static String extra1="chips";
    private static String extra2="drinks";

    private Price Price;

    public Deluxehamburger(String rollType, String meatType, int burtype) {
        super(rollType, meatType, burtype);
        setPrice(new Price(burtype, 0));
        dressTyp();

    }

    public void dressTyp(){
        setDtyp("lettuce", 1, "Cabbage", 1, "Tomato", 1, "carrot", 1);
        System.out.println("Standard Dressing, NO more dressing can be added ");
    }

    public void setPrice(Price price) {
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
