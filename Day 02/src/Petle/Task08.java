package Petle;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

            Scanner firstName = new Scanner(System.in);
            System.out.println("Please enter your first name:");
            String firstName1 = firstName.next();
            firstName1 = firstName1.replaceAll("[^A-Za-z]","");
            System.out.println(firstName1);



    }
}
