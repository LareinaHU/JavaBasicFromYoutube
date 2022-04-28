package test;

import java.util.Arrays;

public class bubble0510 {

    public static void sort(Comparable[] a){
        for(int i=a.length;i>1;i--){
            for(int j=0;j<i-1;j++){
               if(greater(a[j],a[j+1])){
                   exch(a,j,j+1);
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
