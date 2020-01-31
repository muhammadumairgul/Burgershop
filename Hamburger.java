
package Burgershop;

public class Hamburger {

    private Price Price;
    private String Burgername;
    private String rollType;
    private String meatType;
    private Dressing type1;
    private Dressing type2;
    private Dressing type3;
    private Dressing type4;
    private int dressCount=0;

    public Hamburger(String rollType, String meatType, int burtype) {

        this.rollType = rollType;
        this.meatType = meatType;
        setBurgername(burtype);

    }

    public void setBurgername(int typBur) {


        if(typBur==3){
            this.Burgername="Delux Burger";

        }else if(typBur==2){
            this.Burgername="Healthy Burger";

        }else {
            this.Burgername = "Base Burger";
            setDtyp("lettuce", 1, "Cabbage", 1, "Tomato", 1, "carrot", 1);
            setPrice(new Price(typBur, dressCount));
        }

    }

    public String getBurgername() {
        return Burgername;
    }

    public void setPrice(Price price) { // do not need a price setter
        this.Price = price;
    }

    public Price getPrice() {
        return Price;
    }


    public void setDtyp(String ty1, int con1,String ty2, int con2,String ty3, int con3,String ty4, int con4 ){

        this.dressCount +=  con1 + con2 + con3 + con4;
        this.type1= new Dressing(ty1, con1);
        this.type2= new Dressing(ty2, con2);
        this.type3= new Dressing(ty3, con3);
        this.type4= new Dressing(ty4, con4);
    }


    public Dressing getType1() {
        return type1;
    }

    public Dressing getType2() {
        return type2;
    }

    public Dressing getType3() {
        return type3;
    }

    public Dressing getType4() {
        return type4;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }
}
