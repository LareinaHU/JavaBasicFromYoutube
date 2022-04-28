package test;

import sort.Shell;

import java.util.Arrays;

public class Shell1 {
    public static void main(String[] args){
        Integer[] a = {34,45,3432,123,56,788,90,78,5};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
