package Petle;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task051 {
    public static void main(String[] args) {
        /*Random random = new Random();
        for (int i = 1; i <= 6; i++) {

        } */
        Random random = new Random();
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 1; i <= 6; i++) {
            numberSet.add(random.nextInt(48) + 1);
        }
        System.out.println(numberSet);
    }
}
