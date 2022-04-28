package chuangzhi45_64LinkedList;

public class CircleListinTest {
    public static void main(String[] args) throws Exception {
        //创建结点
        CircleListinTest.Node<String> first = new CircleListinTest.Node<String>("aa", null);
        CircleListinTest.Node<String> second = new CircleListinTest.Node<String>("bb", null);
        CircleListinTest.Node<String> third = new CircleListinTest.Node<String>("cc", null);
        CircleListinTest.Node<String> fourth = new CircleListinTest.Node<String>("dd", null);
        CircleListinTest.Node<String> fifth = new CircleListinTest.Node<String>("ee", null);
        CircleListinTest.Node<String> sixth = new CircleListinTest.Node<String>("ff", null);
        CircleListinTest.Node<String> seventh = new CircleListinTest.Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //产生环
        seventh.next = third;
        //查找环的入口结点
        Node<String> entrance = getEntrance(first);
        System.out.println("first链表中入口结点元素为：" + entrance.item);

    }

    public static Node getEntrance(Node<String> first) {
        //定义快慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> temp = null;
        //定义链表，先找到环（快慢指针相遇），准备一个临时指针，指向链表的首结点；
        //继续遍历,直到慢指针和临时指针相遇,那么相遇时所指向的结点就是环的入口
        while (fast != null && fast.next != null) {
            //变换快慢指针
            fast = fast.next.next;
            slow = slow.next;
            //判断快慢指针是否相遇
            if (fast.equals(slow)) {
                temp = first;
                continue;
            }
            //让临时结点变换
            if (temp != null) {
                temp = temp.next;
                //判断临时指针是否和慢指针相遇
                if (temp.equals(slow)) {
                    break;
                }
            }

        }
        return temp;


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
