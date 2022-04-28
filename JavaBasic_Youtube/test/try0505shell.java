package test;

public class try0505shell {

        static void swapValuesUsingThirdVariable(int m, int n)
        {
            int temp = m;
            m = n;
            n = temp;
        }

        public static void main(String[] args)
        {
            int m = 9, n = 5;
            swapValuesUsingThirdVariable(m, n);
            System.out.println(m);
        }
    }
