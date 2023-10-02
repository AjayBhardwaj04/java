package Functions;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        sum();
    }
    static  void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Inter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Inter Number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is = " + sum);
    }
}
