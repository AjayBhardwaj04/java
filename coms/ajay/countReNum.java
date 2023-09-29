package coms.ajay;

public class countReNum {
    public static void main(String[] args) {
        int n = 93421;
        int count = 0;
        while (n > 0){
         int revNub = n % 10;   
         n = n / 10 ;

//            System.out.print(String.valueOf(revNub));
            System.out.print(revNub);
        }
      }
}
