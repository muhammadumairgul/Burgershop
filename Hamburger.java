
package Burgershop;

public class Hamburger {

    private Price Price;
    private String burgername;
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
            this.burgername ="Delux Burger";

        }else if(typBur==2){
            this.burgername ="Healthy Burger";

        }else {
            this.burgername = "Base Burger";

        }

    }

    public String getBurgername() {
        return burgername;
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

    public void retDtyp(){
        System.out.println("Dressing types used in Hamburger are \n" +
                "Type 1: " + type1.getDressingType() + "; Type 2: " + type2.getDressingType() + "; Type 3: " + type3.getDressingType()
                +"; Type 4: " + type4.getDressingType() );
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
