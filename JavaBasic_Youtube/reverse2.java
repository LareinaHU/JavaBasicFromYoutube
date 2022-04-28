import java.util.Arrays;

public class reverse2 {
    public static void main(String[] args){
        int Arrays1[] = new int[]{1,12,34,456};
        System.out.println(Arrays.toString(Arrays1));
        System.out.println(Arrays.toString(reverse22(Arrays1)));

    }


    public static int[] reverse22(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i = n-1;i>=0;i--)
        {
            temp[n-1-i]=arr[i];
        }
        return temp;
    }
}
