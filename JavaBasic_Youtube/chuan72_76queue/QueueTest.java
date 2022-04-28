package chuan72_76queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q=new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");
        q.enqueue("e");
        for (String str : q) {
            System.out.println(str);
        }
        System.out.println("-------");
q.dequeue();
        for (String str2 : q) {
            System.out.println(str2);
        }

    }


}
