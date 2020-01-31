package Burgershop;

public class dressing {

    private String dressingType;
    private int CountD=0;
    private String[] dTyp= {"Lettuce","Olive","Onion-Ring","Cabbage","Carrot","Tomato"};

    public dressing(String dressingType, int countD) {

        this.dressingType = dressingType;

        this.CountD= countD;
    }

    public void dList(){

        for(int i=0; i<dTyp.length; i++) {
            System.out.println("Types of Dressing " + (i + 1) + "-----> " + dTyp[i]);
        }

    }

    public int getCountD() {
        return CountD;
    }

    public String getDressingType() {
        return dressingType;
    }
}
