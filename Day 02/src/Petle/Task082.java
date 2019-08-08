package Petle;

import java.util.Scanner;

public class Task082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wyraz");
        String word = scanner.next();
        StringBuilder endWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            /*
            String tempWord = (word.charAt(i);
            if (tempWord.equals("[^A-Za-z]")) {
                endWord.append(tempWord);
            } else {
                endWord.append("");
            }
             if (Character.isLetter(word.charAt(i))) {
                endWord.append(word.charAt(i));
            } else {
                endWord.append("");
            }*/
            char letter = word.charAt(i);
            if (Character.isLetter(letter)){
                System.out.print(letter);
            }
        }
        System.out.println(endWord.toString());

    }
}
