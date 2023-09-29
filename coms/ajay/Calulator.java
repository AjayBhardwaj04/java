package coms.ajay;

import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

int ans = 0;
        while (true){
// Take the operator as input
            System.out.print("Enter the Operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
//                Input two numbers
                System.out.print(" Inter two Numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println(" ");
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                  if (num2 != 0){
                      ans = num1 / num2;
                  }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op == 'X')  { //  INTER the x / X break the calulator fun.
                break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println("Answers : " + ans);
        }

    }
}
