package chuangzhi38_44SequenceList;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class SequenceList1<T> implements Iterable {

    public static void main(String[] args) {
        SequenceList1<Integer> a = new SequenceList1<>(10);
        SequenceList1<Double> d = new SequenceList1<>(1);
        SequenceList1<String> sl = new SequenceList1<>(10);
        sl.insert("aa");
        sl.insert("bb");
        sl.insert("cc");
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.insert(8);
        a.insert(3, 88);


        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        System.out.println("--------------------");

        //get
        String getResult = sl.get(1);
        System.out.println(getResult);

        Integer i = a.get(1);
        System.out.println("the i number" + i);

        Integer remove = a.remove(3);
        System.out.println(remove);

        a.insert(2, 3);

        String removeResult = sl.remove(0);
        System.out.println(removeResult);

        // sl.clear();
        //System.out.println(sl.length());

        System.out.println("--------------------");

        for (Object o : sl) {
            System.out.println(o);

        }

    }

    private T[] eles;
    private int N;

    public SequenceList1(int capacity) {
        this.eles = (T[]) new Object[capacity];
        this.N = 0;
    }

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        return eles[i];
    }

    public int size() {
        return N;
    }

    public void insert(T t) {
        if (N == eles.length) {
            resize(2 * eles.length);
        }

        eles[N++] = t;  //向线性表中添加元素t
    }

    //在元素i处插入元素t
    public void insert(int i, T t) {
        if (N == eles.length) {
            resize(2 * eles.length);
        }

        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;
        N++;

    }

    //删除指定位置处的元素，并返回该元素
    public T remove(int i) {
        if (N < eles.length / 4) {
            resize(eles.length / 2);
        }
        //1.记录索引i处的值
        T current = eles[i];
        //2.索引i后面元素依次向前移动一位即可；
        for (int index = i; index < N - 1; index++) {
            eles[index] = eles[index + 1];
        }
        //3.元素个数-1
        N--;
        return current;
    }

    //查找t元素第一次出现的位置
    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;

    }

    public void resize(int newSize) {
        T[] temp = eles;
        eles = (T[]) new Object[newSize];
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }

    }


    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    //提供内部类，实现iterator接口
    //该遍历最终需要遍历eles中的数据
    private class SIterator implements Iterator {
        private int cusor;       //提供一个内部变量；

        public SIterator() {     //提供一个构造方法；
            this.cusor = 0;//对成员变量初始化；

        }

        @Override
        public boolean hasNext() {
            return cusor < N;
        }

        //判断在当前容器中，还有没有下一个元素
        @Override
        public Object next() {
            return eles[cusor++];
        }
    }


}
