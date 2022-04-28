package chuangzhi38_44SequenceList;

public class SequenceList_try2 {
    public static void main(String[] args) {
        SequenceList1<String> ss = new SequenceList1<>(3);

        ss.insert("zhangshan");
        ss.insert("lisi");
        ss.insert("wangwu");
        ss.insert("yaoming");
        ss.insert("zhanmusi");
        System.out.println("-----------");
        for (Object s : ss) {
            System.out.println(s);

        }

    }



}
