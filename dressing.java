public class dressing {

    private String dressingType;

    private int CountD;


    public dressing(String dressingType, int countD) {
        this.dressingType = dressingType;
        if(countD==1) {
            this.CountD = countD;
        }
        this.CountD= + countD;
    }

    public void dList(){
        System.out.println("Types of Dressing \n" +
                "1-------------Lettuce \n" +
                "1-------------Olive \n"+
                "1-------------Onion \n"+
                "1-------------Cabbage \n"+
                "1-------------Carrot \n"+
                "1-------------Tomato \n");
    }

    public int getCountD() {
        return CountD;
    }

    public String getDressingType() {
        return dressingType;
    }
}
