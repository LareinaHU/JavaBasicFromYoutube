package chuangzhi45_64LinkedList;

public class CircleListTest {
    public static void main(String[] args) throws Exception {
        //创建结点
        CircleListTest.Node<String> first = new CircleListTest.Node<String>("aa", null);
        CircleListTest.Node<String> second = new CircleListTest.Node<String>("bb", null);
        CircleListTest.Node<String> third = new CircleListTest.Node<String>("cc", null);
        CircleListTest.Node<String> fourth = new CircleListTest.Node<String>("dd", null);
        CircleListTest.Node<String> fifth = new CircleListTest.Node<String>("ee", null);
        CircleListTest.Node<String> sixth = new CircleListTest.Node<String>("ff", null);
        CircleListTest.Node<String> seventh = new CircleListTest.Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //产生环
        seventh.next=third;
        //判断链表是否有环
        boolean circle=isCircle(first);
        System.out.println("first链表中是否有环："+circle);

    }
    public static boolean isCircle(Node<String> first){
        //定义快慢指针
        Node<String> fast=first;
        Node<String> slow=first;
        //遍历链表，如果快慢指针指向同一个结点，那么证明有环
        while(fast!=null&&fast.next!=null){
            //变换fast和slow
            fast=fast.next.next;
            slow=slow.next;
            if(fast.equals(slow)){
                return true;
            }
        }
        return false;
    }


    //结点类
    private static class Node<T> {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }


    }
}
