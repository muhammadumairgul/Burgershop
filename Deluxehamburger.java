public class Deluxehamburger extends Hamburger {

    private static String extra1="chips";
    private static String extra2="drinks";

    public Deluxehamburger(String rollType, String meatType, int burtype) {
        super(rollType, meatType, burtype);
    setDtypDE("lecttuce", "tomato", "carrot", "cabbage");

    }


    public void setDtypDE(String ty1, String ty2,  String ty3, String ty4) {
        super.setDtyp(ty1, 1, ty2, 4, ty3, 1, ty4, 1);
    }

    @Override
    public Price getPrice() {
        return super.getPrice();
    }

    @Override
    public dressing getType1() {
        return super.getType1();
    }



}
