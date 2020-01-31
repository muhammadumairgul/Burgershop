package Burgershop;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        int BurgerChoice=0;

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
                    while(BurgerChoice<=3) {
                        System.out.println("Choose type of Burger \n" +
                                "1--------- Base Hamburger \n" +
                                "2--------- Healthy HamBurger \n" +
                                "3--------- Delux HamBurger");
                        BurgerChoice = scanner.nextInt();
                        scanner.nextLine();
                        if(BurgerChoice==1)
                        {
                            Hamburger baseBurger=new Hamburger("White Bread", "Chicken",1);
                            baseBurger.setDtyp("Olive",2,"Cabbage",1,"tomato", 2, "Onion-Ring",1);
                            System.out.println("Base hamburger price: " + baseBurger.getPrice().getBill());
                            break;
                        }
                        else if(BurgerChoice==2)
                        {
                            HealthyBurger hBurger=new HealthyBurger("Chicken",2);
                            hBurger.setDtyp("Cabbage",3,"Tomato",2);
                            System.out.println("Healthy hamburger price: " + hBurger.getPrice().getBill());
                            break;
                        }
                        else if(BurgerChoice==3)
                        {
                            Deluxehamburger dBurger=new Deluxehamburger("White Bread", "Chicken",3);
                            System.out.println("Base hamburger price: " + dBurger.getPrice().getBill());
                            break;
                        }
                        else {
                            System.out.println("Wrong choice. Please enter 0 to choose again");
                            BurgerChoice = scanner.nextInt();
                            scanner.nextLine();
                            if(BurgerChoice>=4)
                                break;
                        }

                    }
                    BurgerChoice=0;
                    break;
                case 2:
                    dressing items= new dressing("salad", 0);
                    items.dList();

                case 3:


                    break;
                case 4:
                    System.out.println("Thank you For Choosing Bills Burgers");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To choose burger option");
        System.out.println("\t 2 - To see dressing type.");
        System.out.println("\t 3 - To select types of dressing");
        System.out.println("\t 4 - To Quit Menu.");

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
