package test;

public class selection0510 {
    public static void sort(Comparable[] a){
      for(int i=0;i<=a.length-2;i++){
          int minindex=i;
          for(int j=i+1;j<=a.length-1;j++){
              if(greater(a[minindex],a[j])){
                  minindex=j;
              }
          }
          exch(a,minindex,i);


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
