public class Hamburger {

    private Price Price;
    private String Burgername;
    private String rollType;
    private String meatType;
    private dressing type1;
    private dressing type2;
    private dressing type3;
    private dressing type4;
    private int dressCoun;


    public Hamburger(String rollType, String meatType, int burtype) {


        this.rollType = rollType;
        this.meatType = meatType;
        setBurgername(burtype);
      setDtyp("lecttuce",1,"Cabbage",1,"salad",1,"carrot",1);


        setPrice(new Price(burtype,dressCoun));
        //this.Price = new Price(type, additions ); // price function


    }

    public void setBurgername(int typBur) {

        //Scanner dressingName= new Scanner(System.in);
        if(typBur==3){
            this.Burgername="Delux Burger";
//            setDressing1("lecttuce", 1);
//            setDressing2("tomato", 1);
//            setDressing3("cabbage", 1);
//            setDressing4("carrot", 1);

        }else if(typBur==2){
            this.Burgername="Healthy Burger";
//            setDressing1("carrot", 1);
//            setDressing2("tomato", 1);

        }

            this.Burgername="Base Burger";

       // dressingName= new Scanner();
//        setDressing1("lecttuce", 2);
//        setDressing2("tomato", 1);
//        setDressing3("cabbage", 1);
//        setDressing4("carrot", 1);
//
//        setPrice(new Price(1,1));


    }

    public String getBurgername() {

        return Burgername;
    }

    public void setPrice(Price price) {
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

    public void baseBurger(){

    }


    public void setDtyp(String ty1, int con1,String ty2, int con2,String ty3, int con3,String ty4, int con4 ){

        this.dressCoun=  con1 + con2 + con3 + con4;
        setDressing1(ty1,con1);
        setDressing2(ty2,con2);
        setDressing3(ty3,con3);
        setDressing4(ty4,con4);


    }
}
