package sort;

import test.merge0509;

import java.util.Arrays;

public class Merge {

    private static Comparable[] assist; //辅助数组

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //对数组a进行排序；
    public static void sort(Comparable[] a) {
        assist = new Comparable[a.length];
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    //对数组a中元素lo--hi进行排序；
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    //从lo-mid为一组，从mid+1到hi为一组，把数组a中的这两个子组的数据合并成一个有序的大组；
    private static void merge(Comparable[] a, int lo, int mid, int hi) {

        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= hi) {
            if (less(a[p1], a[p2]))
                assist[i++] = a[p1++];
            else {
                assist[i++] = a[p2++];
            }
        }

        while (p1 <= mid) {
            assist[i++] = a[p1++];

        }
        while (p2 <= hi) {
            assist[i++] = a[p2++];

        }
        for (int index = lo; index <= hi; index++) {
         //   System.out.println("x :" + assist[index]);
            a[index] = assist[index];
        }


    }

    public static void main(String[] args) {
        Integer a[] = {354, 575676, 876, 87, 4,4, 6, 3535, 435};
        sort(a);
        System.out.println(Arrays.toString(assist));
        System.out.println(Arrays.toString(a));
    }


}
