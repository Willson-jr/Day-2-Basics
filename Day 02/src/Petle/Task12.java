package Petle;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wyraz");
        String name = scanner.next();
        String reversed = new StringBuilder(name).reverse().toString();
        /*for (int i = 0; i <= name.length()-1; i++) {
            nameSecond += (name.charAt(name.length()-i-1));
        } */
        if (name.equals(reversed)){
            System.out.println("palidrom");
        } else {
            System.out.println("nie");
        }

    }
}
