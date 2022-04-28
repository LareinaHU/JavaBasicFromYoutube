package sort;

public class Shell {
    public static void sort(Comparable[] a) {
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1){
           for(int i=h;i<=a.length-1;i++){
               for(int j=i;j>=h;j-=h){
                   if(greater(a[j-h],a[j])){
                       exchange(a,j-h,j);
                   }else{
                       break;
                   }
               }
           } h=h/2;
        }




    }
    private static boolean greater(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }

    private static void exchange(Comparable[] a, int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
