import java.util.Scanner;

public class com {
    public static void main(String[] args) {

//        for loops
//        for (int num = 1; num <= 10; num += 1){
//            System.out.println(num);
//        }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println( "Hello Ajay -" + i);
        }

    }
}
