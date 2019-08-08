package Petle;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        /*
        do {
        }while();*/
        boolean isPrime = true;
        int cover = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("pierwsza");
        } else {
            System.out.println("zlozona");
        }

    }
}

