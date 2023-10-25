package Functions;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
//        create an array
        int[] arr = {12,1,2,34,12,21,231};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 79;
    }
}
