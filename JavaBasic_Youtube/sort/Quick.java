package sort;

public class Quick {
    // sort arr[begin, end)
    public static void luSort(Integer[] arr, int begin, int end) {
        if (end - begin <= 1) {
            // only one element in it
            return;
        }
        int pivot = partition(arr, begin, end);
        luSort(arr, begin, pivot);
        luSort(arr, pivot + 1, end);
    }


    // find pivot for arr[lo, hi), return index of partition point
    private static int partition(Integer[] arr, int lo, int hi) {
        int base = lo;
        int key = arr[lo++];
        while (lo < hi) {
            while (lo < hi && arr[lo] <= key) {
                lo++;
            }
            if (lo != hi) {
                exch(arr, lo, --hi);
            }
        }
        exch(arr, base, hi - 1);
        return hi - 1;
    }


    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}