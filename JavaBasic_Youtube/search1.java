public class search1 {
    public static void main(String[] args) {
        search1 s = new search1();
        System.out.println(s.search(11));
        System.out.println(s.search(1000));
        System.out.println(s.search(11));
        System.out.println(s.search(123));
        System.out.println(s.search(11));
        System.out.println(s.search(11));
        System.out.println(s.search(11));

    }


    public int search(int num) {
        int[] arr = {11, 12, 123, 23, 46, 677, 88, 0};
        int i;
        for (i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;

            }
        }
        return -1;
    }
}