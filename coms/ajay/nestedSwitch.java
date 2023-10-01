package coms.ajay;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String Department = in.next();

    switch (empId){
        case 1 ->  System.out.println("Ajay Bhardwaj");


        case 2 ->  System.out.println("Ashutosh Varma");

        case 3 ->{
            System.out.println("EmpId num 3");
            switch (Department) {
                case "it" -> System.out.println("IT Department");
                case "bio" -> System.out.println("Biology Department");
                case "civil" -> System.out.println("Civil Serves Department");
            }

    }
        default -> System.out.println("Enter your EmpId ");
    }
}}
