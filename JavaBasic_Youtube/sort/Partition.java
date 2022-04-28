package sort;

public class Partition {
    public static void sort(Comparable[] a){
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);

    }

    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }

        int p = par(a, lo, hi);
        sort(a,lo,p-1);
        sort(a,p+1,hi);
    }

    public static int par(Comparable[] a,int lo,int hi){
    int left=lo;
    int right=hi+1;
    Comparable key= a[lo];
    while (true){
        while(less(key,a[--right])){
            if(right<=lo){
                break;
            }
        }

        while(less(a[++left],key)){
            if(left>=hi){
                break;
            }
        }

        if(left<=right){
            exch(a,left,right);
        }else{
            break;
        }

    }
        exch(a,lo,right);
        return right;
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
