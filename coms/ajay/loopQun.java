package coms.ajay;

import java.util.Scanner;

public class loopQun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        Find the largest  of 3 num.
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);

    }
}