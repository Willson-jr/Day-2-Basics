package Petle;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie");
        String name = scanner.next();
        /*for (int i = 0; i <= name.length()-1; i++) {
            System.out.print(name.charAt(name.length()-i-1));
        }*/
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
