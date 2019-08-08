package Petle;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Wprowadz hasło");
        //String pass = scanner.next();
        String secret = "Programowanie";
        String userPassword;
        /*while (!pass.equals("Programowanie")) {
            System.out.println("Nie prawidłowe hasło, wprowadz ponownie");
            pass = scanner.next();
        }*/
        do {
            System.out.println("Podaj Hasło");
            userPassword = scanner.next();
        } while (!userPassword.equals(secret));

        System.out.println("Prawidlowe");
    }
}
