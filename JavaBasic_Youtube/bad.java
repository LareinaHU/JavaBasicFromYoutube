public class bad {
    public static void main(String[] args){
        int n = 3;
        System.out.println(bad(n));

    }
    public static int bad(int n){
        if(n==0)
            return 0;
        else
            return bad(n/3+1)+n-1;
    }

}
