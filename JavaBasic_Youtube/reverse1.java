import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        int intArray3 []=new int[]{1,2,3,4};

        System.out.println(Arrays.toString(intArray3));
        System.out.println(Arrays.toString(reverse1(intArray3)));
    }

    public static int[] reverse1(int[] arr){
        int n = arr.length;
        int temp;
        for(int start=0,end=n-1;start<=end;start++,end--)
        {
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }

}


