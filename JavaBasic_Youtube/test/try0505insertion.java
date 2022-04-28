package test;

import java.util.Arrays;

public class try0505insertion {
    static void swap1(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }

  static void swap2(int[] a, int x, int y) {
        int temp;
        temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void main(String[] args) {
        int m = 9, n = 5;
        swap1(m, n);
        System.out.println(m + "+ " + n);

        int a[] = {9, 5};
        swap2(a, 0 ,1);
        System.out.println(Arrays.toString(a));
    }
}
