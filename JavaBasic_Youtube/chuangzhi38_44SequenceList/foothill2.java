package chuangzhi38_44SequenceList;

import java.util.Scanner;

public class foothill2 {
    static final int MIN_LENGTH = 6;  //实参
    static final int MAX_LENGTH = 500;//实参

    public static String getString() {

        Scanner input=new Scanner(System.in);
        System.out.println("enter>= " + MIN_LENGTH + " and <=" + MAX_LENGTH + " characters: ");
        String getString = input.nextLine();
        while (getString.length() < MIN_LENGTH || getString.length() > MAX_LENGTH) {
            System.out.println("enter>= " + MIN_LENGTH + " and <= " + MAX_LENGTH + " characters: ");
            getString = input.nextLine();
        }
        return getString;
    }

    public static void main(String[] args) {
        getString();

    }



}