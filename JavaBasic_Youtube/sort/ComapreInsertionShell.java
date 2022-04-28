package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ComapreInsertionShell {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ComapreInsertionShell.class.getClassLoader().getResourceAsStream("sort/reverse_test.txt")));
        String line = null;

        while ((line = reader.readLine()) != null) {
            int i = Integer.parseInt(line);
            list.add(i);
        }
        reader.close();
        Integer[] a = new Integer[list.size()];
        list.toArray(a);



        testQuick1(a);
        testlu(a);
        testMerge(a);
        //shell和merge的速率是差不多的，主要是受到cpu的影响，具体如何选择，则要看排序的稳定性
    }

    public static void testQuick1(Integer[] a) {
        long start = System.currentTimeMillis();
        Quick1.sort(a);
        long end = System.currentTimeMillis();
        System.out.println("Quick1 sort TIME:" + (end - start) + "ms");
    }

    public static void testlu(Integer[] b) {
        long start = System.currentTimeMillis();
        Quick.luSort(b, 0, b.length);
        long end = System.currentTimeMillis();
        System.out.println("lusort TIME:" + (end - start) + "ms");
    }

    public static void testMerge(Integer[] c) {
        long start = System.currentTimeMillis();
        Merge.sort(c);
        long end = System.currentTimeMillis();
        System.out.println("Merge sort TIME:" + (end - start) + "ms");
    }
}



