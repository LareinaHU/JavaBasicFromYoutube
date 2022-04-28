package chuan74_78;

import jdk.nashorn.internal.ir.CallNode;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> ss = new SymbolTable<>();
        ss.put(1,"aa");
        ss.put(2,"bb");
        ss.put(3,"cc");
        ss.put(-1,"aa");


        System.out.println(ss.size());
        System.out.println(ss.get(-1));
        ss.delete(3);
        System.out.println(ss.size());
    }
}
