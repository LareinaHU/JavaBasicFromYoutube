package chuan74_78;

public class OrderSymbolTableTest {
    public static void main(String[] args) {
        OrderSymbolTable<Integer, String> kk = new OrderSymbolTable<>();
        kk.put(1,"aa");
        kk.put(2,"bb");
        kk.put(3,"cc");
        kk.put(3,"dd");
        kk.put(5,"ff");
        kk.put(4,"hh");

        System.out.println(kk.get(2));

    }
}
