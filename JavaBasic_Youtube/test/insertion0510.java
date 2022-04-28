package test;

public class insertion0510 {
    public static void sort(Comparable[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j, j - 1);
                } else {
                    break;
                }

            }
        }

    }

    private static boolean greater(Comparable a, Comparable b){
        return a.compareTo(b)>0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
