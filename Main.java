package Burgershop;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    dressing items=new dressing("salad", 0);
                    items.dList();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To show the burger option");
        System.out.println("\t 2 - To choose a burger item to the list.");
        System.out.println("\t 3 - To show Bill");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }



/*public class Main {
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
        double rechnung = lato.getPrice().getBill();
        System.out.println(rechnung);

    }*/
}
