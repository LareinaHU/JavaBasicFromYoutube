package chuan65_71;

public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "((((dsfsiuu))0)";
        boolean match = isMatch(str);
        System.out.println(str + "whether match or not:" + match);
    }

    public static boolean isMatch(String str) {
        //1.创建栈对象，用来存左括号
        Stack<String> chars = new Stack<>();
        //2.从左往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            String currChar = str.charAt(i) + "";
            //3.判断当前字符串是否为字符串，如果是，则把字符放入栈中
            if (currChar.equals("(")) {
                chars.push(currChar);
            } else if (currChar.equals(")")) {
                //4.继续判断当前字符是否有括号,如果是,则从栈中弹出一个左括号,
                // 并判断弹出的结果是否为null,
                // 如果为null,证明没有匹配的左括号,如果不为null,则证明有匹配的左括号；
                String pop = chars.pop();
                if (pop == null) {
                    return false;
                }
            }
        }
        //5.判断栈中还有没有剩余的左括号，如果有，则证明不匹配
        if (chars.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
