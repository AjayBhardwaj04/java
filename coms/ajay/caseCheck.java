package coms.ajay;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char cha = in.next().trim().charAt(0);

        if(cha >= 'a' && cha <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
    }
}
