package test;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        System.out.println("\nHow many yogurts would you like to buy ?");
        Scanner p= new Scanner(System.in);
        while (p.hasNext()) {
            String choice = p.nextLine();

            if (!choice.isEmpty() && choice.charAt(0) > '0' && choice.charAt(0) < '9') {
                System.out.println("yogurt bought!");
                continue;
            }
            else
            {
                // this letter is negative or letter
                System.out.println("Use only positive numbers, please.");

            }
        }

    }

}
