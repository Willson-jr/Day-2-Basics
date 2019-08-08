package Rekrutacyjne;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Numer");
        String numerEntered = scanner.nextLine();
        StringBuilder numberWithoutDash = new StringBuilder();
        StringBuilder numberWithDash = new StringBuilder();
        /* zadania dla testu
        00-44   48 5555 8361
        0 - 22 1985--324
        555372654
        12jfk34-5 67 dfs 89
         */

        //zostawiamy z podanego teksty tylko liczby
        for (int i = 0; i < numerEntered.length(); i++) {
            char digit = numerEntered.charAt(i);
            if (Character.isDigit(digit)) {
                numberWithoutDash.append(digit);
            }
        }
        //gdy podzielic po 3 liczby znakami "-", jak liczb nie zostaje, lub zostaje 2

        int counter = 0;
        if (numberWithoutDash.length() % 3 != 1) {
            for (int i = 0; i < numberWithoutDash.length(); i++) {
                char digit = numberWithoutDash.charAt(i);
                if (Character.isDigit(digit)) {
                    numberWithDash.append(digit);
                    counter++;
                    if (counter%3==0) {
                        numberWithDash.append("-");
                    }
                }
            }
        }
        //gdy podzielic po 3 liczby znakami "-", zostaje 1
        else if (numberWithoutDash.length() % 3 == 1) {
            int divide3 = numberWithoutDash.length() / 3;
            for (int i = 0; i < numberWithoutDash.length(); i++) {
                char digit = numberWithoutDash.charAt(i);
                if (Character.isDigit(digit)) {
                    numberWithDash.append(digit);
                    // dzilienie liczby przez "-" po 3, wszystkiego oprócz ostatnich 4 symbole
                    if ((i + 1) % 3 == 0 && i < (divide3 - 1) * 3 && i < numberWithoutDash.length() - 1) {
                        numberWithDash.append("-");
                    }
                    // dzielienie liczby przez "-" po 2 - ostatnie 4 symbole
                    if ((i + 1) % 2 == 0 && i > (divide3 - 1) * 3 && i < numberWithoutDash.length() - 1) {
                        numberWithDash.append("-");
                    }
                }
            }
        }
        //System.out.println(numberWithoutDash);
        System.out.println(numberWithDash);


    }


}

