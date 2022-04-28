package sort;

public class Selection {

    public static void sort(Comparable[] a){

        for(int i=0;i<=a.length-2;i++){
            int min_index = i;
              for(int j=i+1;j<=a.length-1;j++){

                    if(greater(a[min_index],a[j])){
                      min_index=j;
                    }

              }
            exch(a,i,min_index);
            }

        }



    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a, int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }





}
