package sort;

import java.util.Arrays;

public class Quick1 {
    public static void main(String[] args) {
        Comparable[] a = {3333,12,4325,34645,756,87,8876,345,235};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(Comparable[] a){
        //对数组元素进行排序
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);
    }

    //对数组a中从元素lo到hi之间的元素进行分组，并返回分组界限对应的索引；
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo) return;
        int partition=par(a,lo,hi);//返回的是分组的分界值所在的索引，分界值位置变换后的索引；
        sort(a,lo,partition-1);
        sort(a,partition+1,hi);


    }

    public static int par(Comparable[] a, int lo, int hi) {
    //确定分界值,定义两个指针分别指向待切元素的最小索引处和最大索引处的下一个位置
        Comparable key = a[lo];
        int left = lo;
        int right = hi + 1;
        //切分
        //先从右向左扫描，移动right指针，找到一个比分界值小的元素，停止；
        //再从左向右扫描，移动right指针，找到一个比分界值大的元素，停止；
        //判断left>=right，如果是，则证明元素扫描完毕，结束循环，如果不是，则交换元素即可；
        while (true) {

            while (less(key, a[--right])) {
                if (right == lo) {
                    break;
                }
            }

            while (less(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }

            if (left >= right) {
                break;
            } else {
                exch(a, left, right);
            }

        }

        //交换分界值
        exch(a, lo, right);
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

