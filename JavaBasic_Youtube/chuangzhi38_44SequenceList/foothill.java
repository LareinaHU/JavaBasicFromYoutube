package chuangzhi38_44SequenceList;

import java.util.Scanner;

public class foothill {
    final int MIN_LENGTH = 6;
    final int MAX_LENGTH = 500;

 public static String getString() {
     foothill ll = new foothill();


     Scanner input=new Scanner(System.in);
         System.out.println("P enter>= " + ll.MIN_LENGTH + " and <=" + ll.MAX_LENGTH + " characters: ");
         String getString = input.nextLine();
         while (getString.length() < ll.MIN_LENGTH || getString.length() > ll.MAX_LENGTH) {
             System.out.println("P enter>= " + ll.MIN_LENGTH + " and <= " + ll.MAX_LENGTH + " characters: ");
             getString = input.nextLine();
         }
         return getString;
     }





}