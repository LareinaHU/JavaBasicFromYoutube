package chuangzhi38_44SequenceList;


import java.util.Arrays;

public class try2 {

    public static Integer [] b;

    public static void try2(int key, Integer[] a, int t) {
        b = new Integer[a.length];

        if (a.length <= key) {
            return;
        }
        for (int i = 0; i < key; i++) {
            b[i] = a[i];
        }
        b[key] = t;

        for (int i = key+1; i < a.length; i++) {
            b[i] = a[i];
        }

    }


    public static void main(String[] args) {
        Integer[] a = {134, 345, 67, 768, 89};
        int key = 2;
        int t = 10000;
        try2(key, a, t);
        double d = 0;
        Double dd;
//        Double dd = new Double(0);
        System.out.println(d);
//        System.out.println(dd);
     System.out.println(Arrays.toString(b));
    }
}
