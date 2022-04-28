package chuangzhi38_44SequenceList;

import java.util.Iterator;

public class SequenceList_try<T> implements Iterable<T> {
    private T[] se;
    private int N;

    public SequenceList_try(int capacity) {
        this.se = (T[]) new Object[capacity];
        this.N = 0;
    }

    public T get(int i) {
        return se[i];
    }
    public int size(){
        return N;
    }

    //在元素i处插入元素t
    public void insert(int i, T t) {
        for (int index = N; index > i; index--) {
            se[index] = se[index - 1];
        }
        se[i] = t;
        N++;
    }

    //插入元素t
    public void insert(T t) {
        se[N++] = t;
    }


    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int cusor;

        public SIterator() {
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return cusor < N;
        }

        @Override
        public Object next() {
            return se[cusor++];
        }
    }



    public static <T> void main(String[] args) {
        SequenceList_try<Integer> s = new SequenceList_try<>(10);
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(2, 68);
        Integer getInteger = s.get(2);
        System.out.println(getInteger);
        System.out.println("----------------");
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }

    }


}
