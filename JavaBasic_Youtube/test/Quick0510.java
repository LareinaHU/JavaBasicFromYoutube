package test;

public class Quick0510 {
    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);

    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);

    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i;
        Comparable key = a[lo];
        int left = lo;
        int right = hi + 1;
        while (true) {
            while (greater(a[--right], key)) {
                if (right <= lo) {
                    break;
                }
            }
            while (greater(key, a[++left])) {
                if (left >= hi) {
                    break;
                }
            }

            if (left >= right) {
                break;
            } else {
                exch(a, left, right);

            }


        }
        exch(a, lo, right);
        return right;
    }

    private static boolean greater(Comparable v, Comparable m) {
        return v.compareTo(m) > 0;
    }


    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}

