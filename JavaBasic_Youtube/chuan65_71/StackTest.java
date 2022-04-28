package chuan65_71;

import com.sun.tools.javac.file.SymbolArchive;
import sun.awt.geom.AreaOp;

public class StackTest {
    public static void main(String[] args) {
        //创建栈
        Stack<String> stack = new Stack<>();
        //压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("----------");
        //弹栈
        String result = stack.pop();
        System.out.println("pop out item:"+result);
        System.out.println("the rest items number:"+stack.size());
    }
}
