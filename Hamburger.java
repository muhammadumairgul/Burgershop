
package Burgershop;

public class Hamburger {

    private Price Price;
    private String Burgername;
    private String rollType;
    private String meatType;
    private dressing type1;
    private dressing type2;
    private dressing type3;
    private dressing type4;
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
        this.type1= new dressing(ty1, con1);
        this.type2= new dressing(ty2, con2);
        this.type3= new dressing(ty3, con3);
        this.type4= new dressing(ty4, con4);
    }


    public dressing getType1() {
        return type1;
    }

    public dressing getType2() {
        return type2;
    }

    public dressing getType3() {
        return type3;
    }

    public dressing getType4() {
        return type4;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }
}
