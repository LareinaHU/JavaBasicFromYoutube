package chuangzhi45_64LinkedList;

public class LinkedListTest2 {
    public static void main(String[] args) {
        LinkedLst<Integer> a = new LinkedLst<>();
        LinkedLst<String> sl = new LinkedLst<>();
        sl.insert(0,"aa");
        sl.insert(0,"bb");
        sl.insert("cc");
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.insert(8);

        for (Object s : sl) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        sl.reverse();
        for (Object o : sl) {
            System.out.println(o);
        }
        System.out.println("--------------------");
        for (Object o : a) {
            System.out.println(o);
        }
        System.out.println("--------------------");
        a.reverse();
        for (Object o : a) {
            System.out.println(o);
        }
        System.out.println("--------------------");
    }
}
