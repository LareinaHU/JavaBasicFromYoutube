package test;

import java.util.ArrayDeque;
import java.util.Arrays;

public class try0505bubble {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                exchange(a[j], a[j + 1]);
            }
        }
    }


    public static void exchange(int x, int y) {

        if (x > y) {
           int temp = x;
            x = y;
            y = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,14,2354,3654,7};
        sort(a);
        System.out.println(Arrays.toString(a));

        int aa = 15, bb = 6;
        exchange(aa, bb);
        {
            System.out.println(aa);
        }
    }

}


