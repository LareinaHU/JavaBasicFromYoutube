package chuangzhi45_64LinkedList;

public class Recircle {
    public static void main(String[] args) throws Exception {
        //创建结点
        Recircle.Node<String> first = new Recircle.Node<String>("aa", null);
        Recircle.Node<String> second = new Recircle.Node<String>("bb", null);
        Recircle.Node<String> third = new Recircle.Node<String>("cc", null);
        Recircle.Node<String> fourth = new Recircle.Node<String>("dd", null);
        Recircle.Node<String> fifth = new Recircle.Node<String>("ee", null);
        Recircle.Node<String> sixth = new Recircle.Node<String>("ff", null);
        Recircle.Node<String> seventh = new Recircle.Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        //产生环
        seventh.next = first;

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

