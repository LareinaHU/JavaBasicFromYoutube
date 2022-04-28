package chuangzhi45_64LinkedList;
public class TowWaytest {
    public static void main(String[] args) {
        TowWayLinkList<Integer> a = new TowWayLinkList<>();
        TowWayLinkList<String> sl = new TowWayLinkList<>();
        sl.insert("aa");
        sl.insert("bb");
        sl.insert("cc");
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.insert(8);
        System.out.println(a.indexOf(5));
        System.out.println(a.indexOf(6));
        System.out.println(a.indexOf(7));
        System.out.println("--------------------");
        System.out.println(a.remove(2));
      //  System.out.println(a.remove(1));




        for (Object s : sl) {
            System.out.println(s);
        }


        //get
        String getR = sl.get(2);
        System.out.println(getR);

        Integer i = a.get(1);
        System.out.println("For a,the i number: " + i);

        Integer Rem = a.remove(2);
        System.out.println(Rem);


        String removeResult = sl.remove(1);
        System.out.println(removeResult);

        //sl.clear();
        //System.out.println(sl.length());

        System.out.println("--------------------");
        System.out.println("the first number:"+sl.getfirst());
        System.out.println("the last number:"+sl.getlast());
    }




}
