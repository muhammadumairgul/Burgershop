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

    public int getCountD() {
        return CountD;
    }

    public String getDressingType() {
        return dressingType;
    }
}
