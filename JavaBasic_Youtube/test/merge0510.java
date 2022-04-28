package test;

public class merge0510 {

    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);

    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a,lo,mid,hi);
    }

    private static Comparable[] assist;

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        assist = new Comparable[a.length];
        int i=lo;
        int p1=lo;
        int p2=mid+1;
        while(p1<=mid&&p2<=hi){
            if(greater(a[p1],a[p2])){
                assist[i++]=a[p2++];

            }else{
                assist[i++]=a[p1++];
            }
        }
        while(p1<=mid){
            assist[i++]=a[p1++];
        }

        while(p2<=hi){
            assist[i++]=a[p2++];
        }

        for(int index=lo;index<=hi;index++){
            a[index]=assist[index];
        }


    }


    private static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}

