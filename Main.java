public class Main {
    public static void main(String[] args){


        Hamburger lato= new Hamburger("keko", "chick", 1 );
        Deluxehamburger lylo= new Deluxehamburger("Plain", "meat", 3);
        System.out.println(lylo.getPrice().getBill());
        System.out.println(lato.getPrice().getBill());
        System.out.println(lato.getType2().getDressingType());
        System.out.println(lylo.getType2().getDressingType());


//        System.out.println(lato.getType1().getDressingType());
//        System.out.println(lato.getType1().getCountD());
//        System.out.println(lato.getType1().getCountD());
//        System.out.println(lato.getType1().getDressingType());
//        double rechnung = lato.getPrice().getBill();
//        System.out.println(rechnung);

    }
}
