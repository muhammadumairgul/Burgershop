public class Hamburger {

    private Price Price;
    private String Burgername;
    private String rollType;
    private String meatType;
    private dressing type1;
    private dressing type2;
    private dressing type3;
    private dressing type4;
    private int dressCoun=0;


    public Hamburger(String rollType, String meatType, int burtype) {

        this.rollType = rollType;
        this.meatType = meatType;
        setBurgername(burtype);
    }

    public void setBurgername(int typBur) {

        //Scanner dressingName= new Scanner(System.in);
        if(typBur==3){
            this.Burgername="Delux Burger";

        }else if(typBur==2){
            this.Burgername="Healthy Burger";
        }
            this.Burgername="Base Burger";
        setDtyp("lettuce", 1,"Cabbage",1,"Tomato",1,"carrot",1);

        setPrice(new Price(typBur,dressCoun)); //used to set price
        
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

    public void setDressing1(String Dresstyp, int con){

            this.type1= new dressing(Dresstyp, con);

    }

    public void setDressing2(String Dresstyp, int con){

        this.type2= new dressing(Dresstyp, con);

    }

    public void setDressing3(String Dresstyp, int con){

        this.type3= new dressing(Dresstyp, con);

    }
    public void setDressing4(String Dresstyp, int con){

        this.type4= new dressing(Dresstyp, con);

    }

    public void setDtyp(String ty1, int con1,String ty2, int con2,String ty3, int con3,String ty4, int con4 ){

        this.dressCoun +=  con1 + con2 + con3 + con4;
        setDressing1(ty1,con1);
        setDressing2(ty2,con2);
        setDressing3(ty3,con3);
        setDressing4(ty4,con4);
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



}
