package Functions;

import java.util.Scanner;

import static java.lang.System.*;

public class recursion {
    public static void main(String[] args) {
       int ans = num2();
        out.println(ans);
    }

    static int num2(){
        Scanner in = new Scanner(System.in);
        out.print("Inter Number 1 : ");
        int num1 = in.nextInt();
        out.print("Inter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
       return sum ;
    }
    static  void sum(){
        Scanner in = new Scanner(System.in);
        out.print("Inter Number 1 : ");
        int num1 = in.nextInt();
        out.print("Inter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        out.println("The Sum is = " + sum);
    }
}
