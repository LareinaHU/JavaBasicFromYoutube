package chuangzhi38_44SequenceList;

import sun.jvm.hotspot.types.CIntegerField;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class try1<T> implements Iterable<T>{
    private T[] eles;
    private int N;

    public try1(int capacity) {
        {
            this.eles = (T[]) new Object[capacity];
            this.N = 0;
        }
    }

    public void insert(int i, T t) {
        for (int index = i; index < N; index++) {
            eles[index + 1] = eles[index];
        }
        N++;
        eles[i] = t;
    }

    private void printArray() {
        for (int i = 0; i < N; i++) {
            System.out.println(eles[i]);
        }
    }


    public static void main(String[] args) {
        try1<Integer> a = new try1<>(10);

        a.insert(0, 5);
        a.insert(0, 16);
        a.insert(0, 26);
        a.insert(0, 36);
        a.insert(0, 46);
        a.insert(0, 56);


        System.out.println("----------------");
        a.printArray();
//        for (Integer o : a) {
//            System.out.println(o);
//
//        }


    }

    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T> {
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public T next() {
            return (T)eles[cusor++];
        }
    }


}
