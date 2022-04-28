package chuan65_71;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node head;
    private int N;



    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Stack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    //把t压入栈
    public void push(T t) {
        //找到首结点指向的第一个结点
        Node oldfirst = head.next;
        //创建新结点
        Node newNode = new Node(t, null);
        //让首结点指向新结点
        head.next = newNode;
        //让新结点指向原来的第一个结点
        newNode.next = oldfirst;
        //元素的个数+1
        N++;
    }

    //弹出栈顶元素
    public T pop() {
        //找到首结点指向的第一个结点
        Node oldFirst = head.next;
        if (oldFirst == null) {
            return null;
        }
        //让首结点指向原来第一个结点的下一个结点
        head.next = oldFirst.next;
        //元素个数-1；
        N--;
        return oldFirst.item;
    }

    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    public class SIterator implements Iterator{
        private Node n;
        public SIterator(){
            this.n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }


    }



}
