package coms.ajay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruits = in.next();
//        String day = in.next();
        int day = in.nextInt();

//        switch (fruits){
//
//            case "mango":
//                System.out.println("King fo fruits");
//                break;
//            case "banana":
//                System.out.println(" Banana is  soft fruits");
//                break;
//            case "Grapes":
//                System.out.println("Grapes is group fruits");
//                break;
//            case "apple":
//                System.out.println("Apple is red  fruits");
//                break;
//            default:
//                System.out.println("qadsafdaef sgsdf");
//
//        }

//        switch (fruits) {
//            case "mango" -> System.out.println("King fo fruits");
//            case "banana" -> System.out.println(" Banana is  soft fruits");
//            case "Grapes" -> System.out.println("Grapes is group fruits");
//            case "apple" -> System.out.println("Apple is red  fruits");
//            default -> System.out.println("qadsafdaef sgsdf");
//        }
//        System.out.println(fruits);

        switch (day) {
            case 1, 2, 3, 4 -> System.out.println("Weekday");
            case 5 -> System.out.println("Holiday");
        }


    }
}
