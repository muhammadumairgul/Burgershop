package Burgershop;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Hamburger baseBurger;
    private static HealthyBurger hBurger;
    private static Deluxehamburger dBurger;
    private static ArrayList<OrderList> sumList= new ArrayList<OrderList>();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        int BurgerChoice=0;
        double totalPrice=0.0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                /*case 0:
                    printInstructions();
                    break;*/
                case 1:
                    while(BurgerChoice<=3) {
                        System.out.println("Choose type of Burger or enter any number greater than 4 to return to main menu \n" +
                                "1--------- Base Hamburger \n" +
                                "2--------- Healthy HamBurger \n" +
                                "3--------- Delux HamBurger");
                        BurgerChoice = scanner.nextInt();
                        scanner.nextLine();
                        if(BurgerChoice==1)
                        {
                            baseBurger=new Hamburger("White Bread", "Chicken",1);
                            baseBurger.setDtyp("Olive",2,"Cabbage",1,"tomato", 2, "Onion-Ring",1);
                            baseBurger.setPrice(new Price(1, 6));
                            System.out.println("Base hamburger price: " + baseBurger.getPrice().getBill());
                            baseBurger.retDtyp();
                            sumList.add(new OrderList("Hamburger", baseBurger.getPrice().getBill() ));
                            //System.out.println(sumList.get(0).getBurgerPrice());


                        }
                        else if(BurgerChoice==2)
                        {
                            hBurger=new HealthyBurger("Chicken",2);
                            hBurger.setDtyp("Cabbage",3,"Tomato",2);
                            System.out.println("Healthy hamburger price: " + hBurger.getPrice().getBill());
                            sumList.add(new OrderList("Healthy Burger", hBurger.getPrice().getBill() ));


                        }
                        else if(BurgerChoice==3)
                        {
                            dBurger=new Deluxehamburger("White Bread", "Chicken",3);
                            System.out.println("Base hamburger price: " + dBurger.getPrice().getBill());
                            sumList.add(new OrderList("Delux Burger", dBurger.getPrice().getBill() ));

                        }
                        else {
                            System.out.println("Returning to main menu");
                            /*BurgerChoice = scanner.nextInt();
                            scanner.nextLine();
                            if(BurgerChoice>=4)*/
                                break;
                        }

                    }
                    //BurgerChoice=0;
                    printInstructions();
                    break;
                case 2:
                    Dressing items= new Dressing("salad", 0);
                    items.dList();
                    printInstructions();
                    break;
                case 3:

                    System.out.println("Bill");
                    for(int i=0; i<sumList.size(); i++) {
                        System.out.println("Burger Item " + (i + 1) + "." +
                                sumList.get(i).getBurgerName() + " @ price of -> " +
                                sumList.get(i).getBurgerPrice());
                        totalPrice=totalPrice + (double)sumList.get(i).getBurgerPrice();

                    }
                    System.out.println("Total Bill = " + totalPrice);
                    printInstructions();
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
        System.out.println("\t 2 - To see Dressing type.");
        System.out.println("\t 3 - Print Bill");
        System.out.println("\t 4 - To Quit Menu.");

    }




}
