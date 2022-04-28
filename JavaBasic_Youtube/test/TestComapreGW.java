package test;

import sort.GW;

public class TestComapreGW {
    public static void main(String[] args){
        GW c1 = new GW();
        c1.setName("Grey");
        c1.setAge(3);
        c1.setHittingValue(1000);

        GW c2 = new GW();
        c2.setName("White");
        c2.setAge(3);
        c2.setHittingValue(10000);

        Comparable max = getMax(c1,c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.print("WINNER: "+max);

    }

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if (result >= 0){
            return c1;
        }
        else {
            return c2;
        }

    }


}
