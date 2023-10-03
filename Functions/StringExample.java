package Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inter your First name:  ");
        String a = in.next();
        System.out.println("Inter your Last name:  ");
        String b = in.next();
        String mass = greet("Hello" + a ,b);
        System.out.println(mass);
    }
static String greet(String  a, String b) {

String gateeing = a + b ;
return gateeing;
}

}

