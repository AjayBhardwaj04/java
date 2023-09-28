package coms.ajay;

public class CountNubs {
    public static void main(String[] args) {
        int n = 1353353;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
n = n / 10;
        }
        System.out.printf(String.valueOf(count));
    }

}
