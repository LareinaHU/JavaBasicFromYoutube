package test;

import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many yogurts would you like to buy ?");

        String choice = input.nextLine();

        for (int i = 0; i <= choice.length() - 1; i++) {
            if (choice.charAt(i)<'0'||choice.charAt(i)>'9') {

                System.out.println("Use only positive numbers, please!");
                return;
            }
        }
        System.out.println("The yogurt numbers:" + choice);

    }
}

